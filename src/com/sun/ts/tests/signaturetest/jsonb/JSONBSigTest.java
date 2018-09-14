/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.signaturetest.jsonb;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import java.io.PrintWriter;
import com.sun.ts.lib.harness.EETest.Fault;
import com.sun.javatest.Status;
import com.sun.ts.tests.signaturetest.*;

/*
 * This class is a simple example of a signature test that extends the
 * SigTest framework class.  This signature test is run outside of the
 * Java EE containers.  This class also contains the boilerplate
 * code necessary to create a signature test using the test framework.
 * To see a complete TCK example see the javaee directory for the Java EE
 * TCK signature test class.
 */
public class JSONBSigTest extends SigTestEE {

  /***** Abstract Method Implementation *****/

  /**
   * Returns a list of strings where each string represents a package name. Each
   * package name will have it's signature tested by the signature test
   * framework.
   * 
   * @return String[] The names of the packages whose signatures should be
   *         verified.
   */
  protected String[] getPackages(String vehicleName) {
    return new String[] { "javax.json.bind", "javax.json.bind.adapter",
        "javax.json.bind.annotation", "javax.json.bind.config",
        "javax.json.bind.serializer", "javax.json.bind.spi" };

  }

  /***** Boilerplate Code *****/

  /**
   * Entry point for different-VM execution. It should delegate to method
   * run(String[], PrintWriter, PrintWriter), and this method should not contain
   * any test configuration.
   */
  public static void main(String[] args) {
    JSONBSigTest theTests = new JSONBSigTest();
    Status s = theTests.run(args, new PrintWriter(System.out),
        new PrintWriter(System.err));
    s.exit();
  }

  /**
   * Entry point for same-VM execution. In different-VM execution, the main
   * method delegates to this method.
   */
  public Status run(String args[], PrintWriter out, PrintWriter err) {

    return super.run(args, out, err);
  }

  /*
   * The following comments are specified in the base class that defines the
   * signature tests. This is done so the test finders will find the right class
   * to run. The implementation of these methods is inherited from the super
   * class which is part of the signature test framework.
   */

  // NOTE: If the API under test is not part of your testing runtime
  // environment, you may use the property sigTestClasspath to specify
  // where the API under test lives. This should almost never be used.
  // Normally the API under test should be specified in the classpath
  // of the VM running the signature tests. Use either the first
  // comment or the one below it depending on which properties your
  // signature tests need. Please do not use both comments.

  /*
   * @class.setup_props: sigTestClasspath, Location of JSON jar files; ts_home;
   */
  public void setup(String[] args, Properties p) throws Fault {
    super.setup(args, p);
  }

  /*
   * @testName: signatureTest
   * 
   * @assertion: A JSON-B platform must implement the required classes and APIs
   * specified in the JSON-B Specification.
   * 
   * @test_Strategy: Using reflection, gather the implementation specific
   * classes and APIs. Compare these results with the expected (required)
   * classes and APIs.
   *
   */

  /*
   * Call the parent class's cleanup method.
   */

  /*
   * define which sig driver we will use
   */
  protected SignatureTestDriver getSigTestDriver() {

    if (driver == null) {
      driver = SignatureTestDriverFactory
          .getInstance(SignatureTestDriverFactory.SIG_TEST);
    }

    return driver;

  } // END getSigTestDriver

} // end class JSONBSigTest
