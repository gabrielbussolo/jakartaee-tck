/*
 * Copyright (c) 2009, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.servlet.spec.async;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.AsyncContext;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;

public class Servlet4 extends GenericServlet {

  private static final String filter_name = "Filter4";

  private static final String TEST_HEADER = "testname";

  private static final Class[] TEST_ARGS = { ServletRequest.class,
      ServletResponse.class };

  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    String test = (String) request.getParameter(TEST_HEADER);
    if (test == null) {
      test = (String) request.getAttribute(TEST_HEADER);
    }

    try {
      Method method = this.getClass().getMethod(test, TEST_ARGS);
      method.invoke(this, new Object[] { request, response });
    } catch (InvocationTargetException ite) {
      throw new ServletException(ite.getTargetException());
    } catch (NoSuchMethodException nsme) {
      throw new ServletException("Test: " + test + " does not exist");
    } catch (Throwable t) {
      throw new ServletException("Error executing test: " + test, t);
    }
  }

  public void direct(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    pw.println(filter_name + "=" + request.getAttribute(filter_name));
    pw.println("Servlet4_Async=" + request.isAsyncSupported());
  }

  public void startA(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    try {
      response.getWriter()
          .println(filter_name + "=" + request.getAttribute(filter_name));
      AsyncContext asyncc = request.startAsync();
      response.getWriter().println("Servlet4_Async=STARTED");
      asyncc.complete();
    } catch (IllegalStateException ilex) {
      response.getWriter().println("Servlet4_Async=NOT_STARTED");
    }
  }

  public void testdirect(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    pw.println(filter_name + "=" + request.getAttribute(filter_name));
    pw.println("Servlet4_Async=" + request.isAsyncSupported());

    String id = (String) request.getParameter("id");
    String path = "/Servlet" + id + "?testname=direct";
    RequestDispatcher rd = getServletContext().getRequestDispatcher(path);

    if (rd == null) {
      pw.println("Null RequestDispatcher got for path=" + path);
    } else {
      rd.forward(request, response);
    }
  }

  public void teststartA(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    pw.println(filter_name + "=" + request.getAttribute(filter_name));
    pw.println("Servlet4_Async=" + request.isAsyncSupported());

    String id = (String) request.getParameter("id");
    String path = "/Servlet" + id + "?testname=startA";
    RequestDispatcher rd = getServletContext().getRequestDispatcher(path);

    if (rd == null) {
      pw.println("Null RequestDispatcher got for path=" + path);
    } else {
      rd.forward(request, response);
    }
  }
}
