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

package com.sun.ts.tests.jsonp.api.collectortests;

import com.sun.ts.tests.jsonp.api.common.JsonPTest;
import com.sun.ts.tests.jsonp.api.common.TestResult;

// $Id$
/**
 * JavaScript Object Notation (JSON) Pointer compatibility tests.<br>
 * Test {@link javax.json.stream.JsonCollectors} class implementation.
 */
public class CollectorTests extends JsonPTest {

  /**
   * Test JSON-P {@link javax.json.stream.JsonCollectors} class implementation.
   * 
   * @throws Fault
   *           when this test failed.
   * 
   * @testName: jsonCollectorTest
   * @assertion_ids: JSONP:JAVADOC:668; JSONP:JAVADOC:669; JSONP:JAVADOC:670;
   *                 JSONP:JAVADOC:671;
   * @test_Strategy: Test all collectors returned by API.
   */
  public void jsonCollectorTest() throws Fault {
    Collectors collectorTest = new Collectors();
    final TestResult result = collectorTest.test();
    result.eval();
  }
}
