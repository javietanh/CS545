<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/30/2019
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>
<h1><spring:message code="userDetails.title"></spring:message></h1>
<p>
    <spring:message code="userDetails.name.label"></spring:message>
    ${user.name}
</p>

<p>
    <spring:message code="userDetails.email.label"></spring:message>
    ${user.email}
</p>

<p>
    <spring:message code="userDetails.age.label"></spring:message>
    ${user.age}
</p>

<p>
    <spring:message code="userDetails.birthday.label"></spring:message>
    ${user.birthday}
</p>

<p>
    <spring:message code="userDetails.role.label"></spring:message>
    ${user.role}
</p>

<p><spring:message code="userDetails.address.label"></spring:message></p>
<p>
    <spring:message code="userDetails.address.street.label"></spring:message>
    ${user.addr.street}
</p>
<p>
    <spring:message code="userDetails.address.state.label"></spring:message>
    ${user.addr.state}
</p>

<p>
    <spring:message code="userDetails.address.zipCode.label"></spring:message>
    ${user.addr.zipCode}
</p>
</body>
</html>
