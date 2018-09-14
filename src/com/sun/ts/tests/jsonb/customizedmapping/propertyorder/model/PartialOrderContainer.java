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

package com.sun.ts.tests.jsonb.customizedmapping.propertyorder.model;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({ "longInstance", "intInstance", "stringInstance" })
public class PartialOrderContainer {
  private int intInstance;

  private String stringInstance;

  private long longInstance;

  private int anIntInstance;

  private int anotherIntInstance;

  private int yetAnotherIntInstance;

  public int getAnIntInstance() {
    intInstance -= 10;
    return anIntInstance;
  }

  public void setAnIntInstance(int anIntInstance) {
    intInstance -= 30;
    this.anIntInstance = anIntInstance;
  }

  public int getAnotherIntInstance() {
    intInstance -= 100;
    return anotherIntInstance;
  }

  public void setAnotherIntInstance(int anotherIntInstance) {
    intInstance -= 300;
    this.anotherIntInstance = anotherIntInstance;
  }

  public int getYetAnotherIntInstance() {
    intInstance -= 1000;
    return yetAnotherIntInstance;
  }

  public void setYetAnotherIntInstance(int yetAnotherIntInstance) {
    intInstance -= 3000;
    this.yetAnotherIntInstance = yetAnotherIntInstance;
  }

  public String getStringInstance() {
    return stringInstance;
  }

  public void setStringInstance(String stringInstance) {
    this.stringInstance = stringInstance;
    if (intInstance == 1) {
      intInstance = 2;
    }
  }

  public int getIntInstance() {
    return intInstance;
  }

  public void setIntInstance(int intInstance) {
    this.intInstance = intInstance;
  }

  public long getLongInstance() {
    return longInstance;
  }

  public void setLongInstance(long longInstance) {
    this.longInstance = longInstance;
    if (intInstance == 2) {
      intInstance = 3;
    }
  }
}
