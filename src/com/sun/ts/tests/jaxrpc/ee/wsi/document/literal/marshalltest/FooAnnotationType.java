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
// JAX-RPC Reference Implementation (1.1, build EA-R15)

package com.sun.ts.tests.jaxrpc.ee.wsi.document.literal.marshalltest;

public class FooAnnotationType implements java.io.Serializable {
  private java.lang.String value;

  public static final String _UnknownString = "Unknown";

  public static final String _PassedString = "Passed";

  public static final String _FailedString = "Failed";

  public static final java.lang.String _Unknown = new java.lang.String(
      _UnknownString);

  public static final java.lang.String _Passed = new java.lang.String(
      _PassedString);

  public static final java.lang.String _Failed = new java.lang.String(
      _FailedString);

  public static final FooAnnotationType Unknown = new FooAnnotationType(
      _Unknown);

  public static final FooAnnotationType Passed = new FooAnnotationType(_Passed);

  public static final FooAnnotationType Failed = new FooAnnotationType(_Failed);

  protected FooAnnotationType(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getValue() {
    return value;
  }

  public static FooAnnotationType fromValue(java.lang.String value)
      throws java.lang.IllegalStateException {
    if (Unknown.value.equals(value)) {
      return Unknown;
    } else if (Passed.value.equals(value)) {
      return Passed;
    } else if (Failed.value.equals(value)) {
      return Failed;
    }
    throw new IllegalArgumentException();
  }

  public static FooAnnotationType fromString(String value)
      throws java.lang.IllegalStateException {
    if (value.equals(_UnknownString)) {
      return Unknown;
    } else if (value.equals(_PassedString)) {
      return Passed;
    } else if (value.equals(_FailedString)) {
      return Failed;
    }
    throw new IllegalArgumentException();
  }

  public String toString() {
    return value.toString();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof FooAnnotationType)) {
      return false;
    }
    return ((FooAnnotationType) obj).value.equals(value);
  }

  public int hashCode() {
    return value.hashCode();
  }
}
