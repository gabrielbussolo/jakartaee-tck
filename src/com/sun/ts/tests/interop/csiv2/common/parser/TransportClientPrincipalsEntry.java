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

package com.sun.ts.tests.interop.csiv2.common.parser;

import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.util.*;

public class TransportClientPrincipalsEntry extends Entry {
  public TransportClientPrincipalsEntry(Element element) throws ParseException {
    if (!element.getTagName().equals("transport-client-principals")) {
      throw new ParseException("Unexpected tag: " + element.getTagName());
    }
    NodeList nodes = element.getChildNodes();
    for (int i = 0; i < nodes.getLength(); i++) {
      Node node = nodes.item(i);
      if (node.getNodeName().equals("principal")) {
        principals.addElement(getText(node));
      }
    }
  }

  public Vector getPrincipals() {
    return principals;
  }

  public String toString() {
    String result = "<transport-client-principals>\n";
    for (int i = 0; i < principals.size(); i++) {
      result += "<principal>" + principals.elementAt(i) + "</principal>\n";
    }
    result += "</transport-client-principals>\n";
    return result;
  }

  private Vector principals = new Vector();
}
