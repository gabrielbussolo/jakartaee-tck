<%--

    Copyright (c) 2003, 2018 Oracle and/or its affiliates. All rights reserved.

    This program and the accompanying materials are made available under the
    terms of the Eclipse Public License v. 2.0, which is available at
    http://www.eclipse.org/legal/epl-2.0.

    This Source Code may also be made available under the following Secondary
    Licenses when the conditions for such availability set forth in the
    Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
    version 2 with the GNU Classpath Exception, which is available at
    https://www.gnu.org/software/classpath/license.html.

    SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0

--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tck" uri="http://java.sun.com/jstltck/jstltck-util" %>
<%@ page import="java.util.Date" %>
<tck:test testName="positiveFDTypeTest">
    <%  
        Date date = new Date(883192294202L);
        pageContext.setAttribute("dte", date);
    %>
    <c:set var="tim" value="time"/>
    <c:set var="dat" value="date"/>
    <c:set var="bot" value="both"/>
    <fmt:setLocale value="en_US"/>
    <fmt:setTimeZone value="EST"/>

    <!-- the type attribute specifies if either the time or date
             or both components of the provided date value will
             be formatted. If type is not specified, the default is
             date. -->
    date: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'/><br>
    date: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type='<%= (String) pageContext.getAttribute("dat") %>'/><br>
    date: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type="date"/><br>
    time: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type='<%= (String) pageContext.getAttribute("tim") %>'/><br>
    time: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type="time"/><br>
    both: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type='<%= (String) pageContext.getAttribute("bot") %>'/><br>
    both: <fmt:formatDate value='<%= (Date) pageContext.getAttribute("dte") %>'
                             type="both"/><br>
    
</tck:test>
