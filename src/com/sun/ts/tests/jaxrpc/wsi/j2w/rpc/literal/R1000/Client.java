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

/*
 * %w% %E%
 */

package com.sun.ts.tests.jaxrpc.wsi.j2w.rpc.literal.R1000;

import com.sun.ts.lib.harness.ServiceEETest;
import com.sun.ts.lib.harness.EETest;
import com.sun.ts.tests.jaxrpc.sharedclients.ClientFactory;
import com.sun.ts.tests.jaxrpc.sharedclients.faultclient.FaultTestClient;
import com.sun.ts.tests.jaxrpc.wsi.utils.SOAPUtils;
import com.sun.ts.tests.jaxrpc.wsi.requests.SOAPRequests;
import com.sun.javatest.Status;

import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPElement;
import java.util.Properties;
import java.util.Iterator;

/**
 * Tests R1000 in the WSI Basic Profile 1.0: When a MESSAGE contains a
 * soap:Fault element, that element MUST NOT have element children other than
 * faultcode , faultstring , faultactor and detail .
 */
public class Client extends ServiceEETest implements SOAPRequests {

  private FaultTestClient client;

  /**
   * Test entry point.
   *
   * @param args
   *          the command-line arguments.
   */
  public static void main(String[] args) {
    Client tests = new Client();
    Status status = tests.run(args, System.out, System.err);
    status.exit();
  }

  /**
   * @class.testArgs: -ap jaxrpc-url-props.dat
   * @class.setup_props: webServerHost; webServerPort; platform.mode;
   *
   * @param args
   * @param properties
   *
   * @throws com.sun.ts.lib.harness.EETest.Fault
   */
  public void setup(String[] args, Properties properties) throws EETest.Fault {
    client = (FaultTestClient) ClientFactory.getClient(FaultTestClient.class,
        properties);
    logMsg("setup ok");
  }

  public void cleanup() {
    logMsg("cleanup");
  }

  /**
   * @testName: testSoapFaultChildrenDummyException
   *
   * @assertion_ids: JAXRPC:WSI:R1000
   *
   * @test_Strategy: Make a request and inspect response to ensure the
   *                 soap:Fault only has children of faultcode , faultstring ,
   *                 faultactor and detail.
   *
   * @throws com.sun.ts.lib.harness.EETest.Fault
   */
  public void testSoapFaultChildrenDummyException() throws EETest.Fault {
    SOAPMessage response = null;
    try {
      response = client.makeSaajRequest(ALWAYS_THROWS_EXCEPTION);
    } catch (Exception e) {
      throw new EETest.Fault("Test didn't complete properly: ", e);
    }
    try {
      validateFaultChildrenNames(response);
    } catch (SOAPException se) {
      throw new EETest.Fault("Error creating response object", se);
    }
    client.logMessageInHarness(response);
  }

  /**
   * @testName: testSoapFaultChildrenServerException
   *
   * @assertion_ids: JAXRPC:WSI:R1000
   *
   * @test_Strategy: Make a request and inspect response to ensure the
   *                 soap:Fault only has children of faultcode , faultstring ,
   *                 faultactor and detail.
   *
   * @throws com.sun.ts.lib.harness.EETest.Fault
   */
  public void testSoapFaultChildrenServerException() throws EETest.Fault {
    SOAPMessage response = null;
    try {
      response = client.makeSaajRequest(ALWAYS_THROWS_SERVER_EXCEPTION);
    } catch (Exception e) {
      throw new EETest.Fault("Test didn't complete properly: ", e);
    }
    try {
      validateFaultChildrenNames(response);
    } catch (SOAPException se) {
      throw new EETest.Fault("Error creating response object", se);
    }
    client.logMessageInHarness(response);
  }

  private void validateFaultChildrenNames(SOAPMessage response)
      throws EETest.Fault, SOAPException {
    Iterator children = response.getSOAPPart().getEnvelope().getBody()
        .getFault().getChildElements();
    SOAPElement child;
    while (children.hasNext()) {
      child = (SOAPElement) children.next();
      if (!(SOAPUtils.isValidSoapFaultChildName(child))) {
        client.logMessageInHarness(response);
        throw new EETest.Fault("Invalid soap:Fault child name (BP-R1000): "
            + child.getElementName().getLocalName());
      }
    }
  }
}
