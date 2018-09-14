/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jaxrs.ee.rs.formparam.locator;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.TreeSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.ts.tests.jaxrs.common.AbstractMessageBodyRW;
import com.sun.ts.tests.jaxrs.ee.rs.ParamEntityWithConstructor;
import com.sun.ts.tests.jaxrs.ee.rs.ParamEntityWithFromString;
import com.sun.ts.tests.jaxrs.ee.rs.ParamEntityWithValueOf;
import com.sun.ts.tests.jaxrs.ee.rs.formparam.FormParamTest;

public class MiddleResource {

  private Response returnValue;

  FormParamTest resource;

  public MiddleResource() {
    returnValue = null;
  }

  protected MiddleResource(String path, String arg) {
    Method m = getMethod(path);
    Object o = getMethodArgument(path, arg);
    resource = new FormParamTest();
    try {
      returnValue = (Response) m.invoke(resource, o);
    } catch (Exception e) {
      returnValue = Response.ok(e).build();
    }
  }

  @POST
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public Response returnValue() {
    return returnValue;
  }

  private static Method getMethod(String id) {
    Method[] methods = FormParamTest.class.getMethods();
    for (Method m : methods) {
      String path = AbstractMessageBodyRW.getPathValue(m.getAnnotations());
      if (path != null && path.substring(1, path.length()).startsWith(id))
        return m;
    }
    return null;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private static Object getMethodArgument(String path, String arg) {
    Object o;
    // Choose entity
    if (path.contains("Constructor"))
      o = new ParamEntityWithConstructor(arg);
    else if (path.contains("FromString"))
      o = ParamEntityWithFromString.fromString(arg);
    else if (path.contains("ValueOf"))
      o = ParamEntityWithValueOf.valueOf(arg);
    else
      o = arg;

    // Choose collection
    if (path.contains("SortedSet"))
      o = new TreeSet(Collections.singleton(o));
    else if (path.contains("Set"))
      o = Collections.singleton(o);
    else if (path.contains("List"))
      o = Collections.singletonList(o);

    return o;
  }

}
