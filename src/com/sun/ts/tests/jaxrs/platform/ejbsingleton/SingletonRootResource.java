/*
 * Copyright (c) 2010, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jaxrs.platform.ejbsingleton;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

@Singleton
@Path("/sgb")
public class SingletonRootResource {

  @Context
  private UriInfo uri;

  @GET
  public String get() {
    return "GET: " + uri.getRequestUri().toASCIIString()
        + " Hello From Singleton EJB Root";
  }

  @EJB
  SingletonResource r;

  @Path("/sub")
  public SingletonResource getSub() {
    return r;
  }

  @EJB
  SingletonLocalIF rl;

  @Path("/localsub")
  public SingletonLocalIF getLocalSub() {
    return rl;
  }

  @Path("exception")
  @GET
  public String throwException() {
    throw new EJBException(new WebApplicationException(Status.CREATED));
  }

  // <JAXRS:SPEC:53.1,3 ----------------------------------------------->
  @Context
  private Application injectedApplication;

  private boolean isJaxrsInjectedPriorToPostConstruct = false;

  @PostConstruct
  public void postConstruct() {
    isJaxrsInjectedPriorToPostConstruct = injectedApplication != null;
  }

  @Path("priorroot")
  @GET
  public String jaxrsInjectPriorPostConstructOnRootResource() {
    return String.valueOf(isJaxrsInjectedPriorToPostConstruct);
  }
  // </JAXRS:SPEC:53.1,3 ----------------------------------------------->

}
