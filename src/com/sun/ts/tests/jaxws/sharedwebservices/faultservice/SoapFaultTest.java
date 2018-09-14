/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */

package com.sun.ts.tests.jaxws.sharedwebservices.faultservice;

import java.rmi.ServerException;

@javax.jws.WebService(targetNamespace = "http://faulttestservice.org/wsdl")
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.RPC, use = javax.jws.soap.SOAPBinding.Use.LITERAL, parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED)
public interface SoapFaultTest {
  public String alwaysThrowsException() throws DummyException;

  public String alwaysThrowsServerException() throws ServerException;

  public String alwaysThrowsSOAPFaultExceptionDetailNoChildren();

  public String alwaysThrowsSOAPFaultExceptionDetailUnqualifiedChildren();

  public String alwaysThrowsSOAPFaultExceptionDetailQualifiedChildren();

  public String alwaysThrowsSOAPFaultExceptionDetailNoAttributes();

  public String alwaysThrowsSOAPFaultExceptionDetailQualifiedAttributes();
}
