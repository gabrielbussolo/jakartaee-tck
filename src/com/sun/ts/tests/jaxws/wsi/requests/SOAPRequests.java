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

package com.sun.ts.tests.jaxws.wsi.requests;

public interface SOAPRequests {
  public static final String HELLOWORLD = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String HELLOWORLD_WITH_HANDLER = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/types'><env:Header><cts:test env:actor='http://conformance-checker.org' xmlns:cts='http://cts.org'>response</cts:test></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String HELLOWORLD_WITH_CONFORMANCE_WITH_MU1 = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/types'><env:Header><wsi:Claim conformsTo='http://ws-i.org/profiles/basic1.0/' xmlns:wsi='http://ws-i.org/schemas/conformanceClaim/' env:actor='http://schemas.xmlsoap.org/soap/actor/next' env:mustUnderstand='1'/></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String HELLOWORLD_WITH_CONFORMANCE_WITH_MU0 = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/types'><env:Header><wsi:Claim conformsTo='http://ws-i.org/profiles/basic1.0/' xmlns:wsi='http://ws-i.org/schemas/conformanceClaim/' env:actor='http://schemas.xmlsoap.org/soap/actor/next' env:mustUnderstand='0'/></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String HELLOWORLD_WITH_CONFORMANCE = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/types'><env:Header><wsi:Claim conformsTo='http://ws-i.org/profiles/basic1.0/' xmlns:wsi='http://ws-i.org/schemas/conformanceClaim/' /></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String HELLOWORLD_WITH_MULTIPLE_CONFORMANCE = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/types'><env:Header><wsi:Claim conformsTo='http://ws-i.org/profiles/basic1.0/' xmlns:wsi='http://ws-i.org/schemas/conformanceClaim/' /><wsi:Claim conformsTo='http://dummy/conformanceClaim' xmlns:wsi='http://ws-i.org/schemas/conformanceClaim/' /></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String ALWAYS_THROWS_EXCEPTION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://faulttestservice.org/wsdl' xmlns:ns1='http://faulttestservice.org/wsdl'><env:Body><ns0:alwaysThrowsException/></env:Body></env:Envelope>";

  public static final String ALWAYS_THROWS_SERVER_EXCEPTION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://faulttestservice.org/wsdl' xmlns:ns1='http://faulttestservice.org/wsdl'><env:Body><ns0:alwaysThrowsServerException/></env:Body></env:Envelope>";

  public static final String BAD_SOAP_ENVELOPE = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://not.soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String MUST_UNDERSTAND_HEADER = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Header><foo:Bar xmlns:foo='http://foo.org/bar/' env:actor='http://schemas.xmlsoap.org/soap/actor/next' env:mustUnderstand='1'>BAZ</foo:Bar></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String NON_EXISTANT_OPERATION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:nonExistantOperation/></env:Body></env:Envelope>";

  public static final String BAD_SOAP_ENVELOPE_WITH_HEADER = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://not.soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Header><foo:Bar xmlns:foo='http://foo.org/bar/' env:actor='http://foo.org/actor' env:mustUnderstand='1'>BAZ</foo:Bar></env:Header><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String BAD_SOAP_ENVELOPE_NON_EXISTANT_OPERATION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://not.soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:nonExistantOperation/></env:Body></env:Envelope>";

  public static final String MUST_UNDERSTAND_HEADER_NON_EXISTANT_OPERATION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Header><foo:Bar xmlns:foo='http://foo.org/bar/' env:actor='http://schemas.xmlsoap.org/soap/actor/next' env:mustUnderstand='1'>BAZ</foo:Bar></env:Header><env:Body><ns0:nonExistantOperation/></env:Body></env:Envelope>";

  public static final String SOAP_ACTION_HELLO_WORLD = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://soapactionservice.org/wsdl/' xmlns:ns1='http://soapactionservice.org/types/'><env:Body><ns0:helloWorld/></env:Body></env:Envelope>";

  public static final String SOAP_ACTION_ECHO_STRING = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://soapactionservice.org/wsdl/' xmlns:ns1='http://soapactionservice.org/types/'><env:Header><cts:test env:actor='http://conformance-checker.org' xmlns:cts='http://cts.org'>response</cts:test></env:Header><env:Body><ns0:echoString><str><ans1:p1 xmlns:ans1=\"http://soapactionservice.org/xsd\">echo</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String ARRAY_OPERATION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:arrayOperation/></env:Body></env:Envelope>";

  public static final String ONE_WAY_OPERATION = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://simpletestservice.org/wsdl' xmlns:ns1='http://simpletestservice.org/wsdl'><env:Body><ns0:oneWayOperation/></env:Body></env:Envelope>";

  public static final String ECHO_STRING = "<?xml version='1.0' encoding='UTF-8'?><!-- Copyright (c) 2003 Oracle Corporation.  All rights reserved. --><env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:enc='http://schemas.xmlsoap.org/soap/encoding/' xmlns:ns0='http://soapactionservice.org/wsdl/' xmlns:ns1='http://soapactionservice.org/types/'><env:Header><cts:test env:actor='http://conformance-checker.org' xmlns:cts='http://cts.org'>response</cts:test></env:Header><env:Body><ns0:echoString><str><ans1:p1 xmlns:ans1=\"http://soapactionservice.org/xsd\">echo</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R0007_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr0007testservice.org/W2JRLR0007TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str><ans1:p1 xmlns:ans1=\"http://w2jrlr0007testservice.org/xsd\">R0007-1</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R0007_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr0007testservice.org/W2JRLR0007TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result><ans1:p1 xmlns:ans1=\"http://w2jrlr0007testservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R1011_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr1011testservice.org/W2JRLR1011TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr1011testservice.org/xsd\">R1011-1</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R1011_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr1011testservice.org/W2JRLR1011TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr1011testservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R1012_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr1012testservice.org/W2JRLR1012TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr1012testservice.org/xsd\">R1012-1</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R1012_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr1012testservice.org/W2JRLR1012TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr1012testservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R97XX_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr97XXtestservice.org/W2JRLR97XXTestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr97XXtestservice.org/xsd\">R97XX-1</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R97XX_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr97XXtestservice.org/W2JRLR97XXTestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr97XXtestservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R2301_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://rpclitservice.org/wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:getBean/></env:Body></env:Envelope>";

  public static final String R2729_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr2729testservice.org/W2JRLR2729TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr2729testservice.org/xsd\">R2729</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R2744_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr2744testservice.org/W2JRLR2744TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr2744testservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R2745_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr2745testservice.org/W2JRLR2745TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr2745testservice.org/xsd\">{0}</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R4001_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr4001testservice.org/W2JRLR4001TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoString><str xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr4001testservice.org/xsd\">R4001-1</ans1:p1></str></ns0:echoString></env:Body></env:Envelope>";

  public static final String R4001_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr4001testservice.org/W2JRLR4001TestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoStringResponse><result xmlns=\"\"><ans1:p1 xmlns:ans1=\"http://w2jrlr4001testservice.org/xsd\">R4001-2</ans1:p1></result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public static final String R2751_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Header><ConfigHeader3Request xmlns=\"http://w2jrlr2751testservice.org/types4\"><message xmlns=\"\">ConfigHeader3</message></ConfigHeader3Request><ConfigHeaderRequest xmlns=\"http://w2jrlr2751testservice.org/types4\"><message xmlns=\"\">ConfigHeader</message></ConfigHeaderRequest><ConfigHeader2Request xmlns=\"http://w2jrlr2751testservice.org/types4\"><message xmlns=\"\">ConfigHeader2</message></ConfigHeader2Request></env:Header><env:Body><echoIt xmlns=\"http://w2jrlr2751testservice.org/W2JRLR2751TestDefs.wsdl\"><Item xmlns=\"\">foo</Item></echoIt></env:Body></env:Envelope>";

  public static final String R273X_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr273Xtestservice.org/W2JRLR273XTestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoFooBar><fooBarRequest xmlns=\"\"><ans1:foo xmlns:ans1=\"http://w2jrlr273Xtestservice.org/xsd\">I am a foo request</ans1:foo><ans1:bar xmlns:ans1=\"http://w2jrlr273Xtestservice.org/xsd\">I am a bar request</ans1:bar></fooBarRequest></ns0:echoFooBar></env:Body></env:Envelope>";

  public static final String R273X_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jrlr273Xtestservice.org/W2JRLR273XTestService.wsdl\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:echoFooBarResponse><fooBarResponse xmlns=\"\"><ans1:foo xmlns:ans1=\"http://w2jrlr273Xtestservice.org/xsd\">{0}</ans1:foo><ans1:bar xmlns:ans1=\"http://w2jrlr273Xtestservice.org/xsd\">I am a bar request</ans1:bar></fooBarResponse></ns0:echoFooBarResponse></env:Body></env:Envelope>";

  public static final String R2712_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://w2jdlr2712testservice.org/types\"><env:Body><ns0:HelloRequestElement><string>{0}</string></ns0:HelloRequestElement></env:Body></env:Envelope>";

  public static final String R2712_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://w2jdlr2712testservice.org/types\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Body><ns0:HelloResponseElement><string>{0}</string></ns0:HelloResponseElement></env:Body></env:Envelope>";

  public static final String R11XX_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:ns0=\"http://soapactionservice.org/wsdl/\"><env:Body><ns0:echoStringResponse><result>{0}</result></ns0:echoStringResponse></env:Body></env:Envelope>";

  public final String R2915_UTF8_REQUEST_NO_ATTACHMENTS = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:echoNoAttachments><request><ns0:myString>Hello</ns0:myString></request></ns1:echoNoAttachments></env:Body></env:Envelope>";

  public final String R2915_UTF16_REQUEST_NO_ATTACHMENTS = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:echoNoAttachments><request><ns0:myString>Hello</ns0:myString></request></ns1:echoNoAttachments></env:Body></env:Envelope>";

  public final String R2915_UTF8_REQUEST_NO_ATTACHMENTS_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\"><env:Body><ns0:InputRequestString><ns0:myString>Hello</ns0:myString></ns0:InputRequestString></env:Body></env:Envelope>";

  public final String R2915_UTF16_REQUEST_NO_ATTACHMENTS_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\"><env:Body><ns0:InputRequestString><ns0:myString>Hello</ns0:myString></ns0:InputRequestString></env:Body></env:Envelope>";

  public final String R2917_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:echoNoAttachments><request><ns0:myString>Hello</ns0:myString></request></ns1:echoNoAttachments></env:Body></env:Envelope>";

  public final String R2925_REQUEST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:getMultipleAttachments><request><ns0:mimeType1>text/plain</ns0:mimeType1><ns0:mimeType2>text/html</ns0:mimeType2><ns0:url1>http://localhost:8080/WSIRLSwaTest/attach.txt</ns0:url1><ns0:url2>http://localhost:8080/WSIRLSwaTest/attach.html</ns0:url2></request></ns1:getMultipleAttachments></env:Body></env:Envelope>";

  public final String R2917_REQUEST_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\"><env:Body><ns0:InputRequestString><ns0:myString>Hello</ns0:myString></ns0:InputRequestString></env:Body></env:Envelope>";

  public final String R2925_REQUEST_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\"><env:Body><ns0:InputRequestGet><ns0:mimeType1>text/plain</ns0:mimeType1><ns0:mimeType2>text/html</ns0:mimeType2><ns0:url1>http://localhost:8080/WSIDLSwaTest/attach.txt</ns0:url1><ns0:url2>http://localhost:8080/WSIDLSwaTest/attach.html</ns0:url2></ns0:InputRequestGet></env:Body></env:Envelope>";

  public final String R2917_RESPONSE1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:putMultipleAttachmentsResponse><result>{0}</result></ns1:putMultipleAttachmentsResponse></env:Body></env:Envelope>";

  public final String R2917_RESPONSE2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\" xmlns:ns1=\"http://SwaTestService.org/wsdl\"><env:Body><ns1:echoNoAttachmentsResponse><result>{0}</result></ns1:echoNoAttachmentsResponse></env:Body></env:Envelope>";

  public final String R2917_RESPONSE_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns0=\"http://SwaTestService.org/xsd\"><env:Body><ns0:OutputResponseString><ns0:myString>{0}</ns0:myString></ns0:OutputResponseString></env:Body></env:Envelope>";

  public final String MTOM_RESPONSE_DOCLIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><MTOMIn2Response xmlns=\"http://mtomtestservice.org/xsd\">{0}</MTOMIn2Response></soapenv:Body></soapenv:Envelope>";
}
