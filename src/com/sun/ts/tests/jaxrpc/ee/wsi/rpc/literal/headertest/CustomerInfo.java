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

// This class was generated by the JAXRPC RI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Reference Implementation (1.1, build EA-R10)

package com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest;

public class CustomerInfo {
  protected java.lang.String creditcard;

  protected java.lang.String name;

  protected java.lang.String street;

  protected java.lang.String city;

  protected java.lang.String state;

  protected java.lang.String zip;

  protected java.lang.String country;

  public CustomerInfo() {
  }

  public CustomerInfo(java.lang.String creditcard, java.lang.String name,
      java.lang.String street, java.lang.String city, java.lang.String state,
      java.lang.String zip, java.lang.String country) {
    this.creditcard = creditcard;
    this.name = name;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }

  public java.lang.String getCreditcard() {
    return creditcard;
  }

  public void setCreditcard(java.lang.String creditcard) {
    this.creditcard = creditcard;
  }

  public java.lang.String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getStreet() {
    return street;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }

  public java.lang.String getCity() {
    return city;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public java.lang.String getState() {
    return state;
  }

  public void setState(java.lang.String state) {
    this.state = state;
  }

  public java.lang.String getZip() {
    return zip;
  }

  public void setZip(java.lang.String zip) {
    this.zip = zip;
  }

  public java.lang.String getCountry() {
    return country;
  }

  public void setCountry(java.lang.String country) {
    this.country = country;
  }
}
