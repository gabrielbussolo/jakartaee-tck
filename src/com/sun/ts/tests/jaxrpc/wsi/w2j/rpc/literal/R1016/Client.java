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

package com.sun.ts.tests.jaxrpc.wsi.w2j.rpc.literal.R1016;

import com.sun.ts.lib.harness.ServiceEETest;
import com.sun.ts.lib.harness.EETest;
import com.sun.ts.lib.util.TestUtil;
import com.sun.ts.tests.jaxrpc.sharedclients.ClientFactory;
import com.sun.ts.tests.jaxrpc.wsi.requests.SOAPRequests;
import com.sun.javatest.Status;

import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPElement;
import javax.xml.rpc.soap.SOAPFaultException;
import java.util.Properties;
import java.util.Iterator;
import java.rmi.RemoteException;
import java.rmi.ServerException;

/**
 * Tests R1016 in the WSI Basic Profile 1.0: A RECEIVER MUST accept fault
 * messages that carry an xml:lang attribute on the faultstring element.
 */
public class Client extends ServiceEETest implements SOAPRequests {

  private W2JRLR1016Client client;

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
    client = (W2JRLR1016Client) ClientFactory.getClient(W2JRLR1016Client.class,
        properties);
    logMsg("setup ok");
  }

  public void cleanup() {
    logMsg("cleanup");
  }

  /**
   * @testName: testCanAcceptXMLLangAttribute
   *
   * @assertion_ids: JAXRPC:WSI:R1016
   *
   * @test_Strategy: Make a request that generates a fault with an xml:lang
   *                 attribute on the faultstring element, ensure the client can
   *                 accept the fault
   *
   * @throws com.sun.ts.lib.harness.EETest.Fault
   */
  public void testCanAcceptXMLLangAttribute() throws EETest.Fault {
    try {
      client.alwaysThrowsServerException();
    } catch (ServerException se) {
      // expected result
    } catch (RemoteException re) {
      // expected result
    } catch (SOAPFaultException sfe) {
      // expected result
    } catch (Exception e) {
      TestUtil.printStackTrace(e);
      throw new EETest.Fault("Test didn't complete properly: ", e);
    }
  }
}
