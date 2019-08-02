<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/30/2019
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Form</title>
    <style>
        .error {
            color: red;
            font-style: italic;
        }
    </style>
</head>
<body>
<h1><spring:message code="userForm.title"></spring:message></h1>
<hr/>

<form:form modelAttribute="user">
    <p>
        <spring:message code="userForm.name.label"></spring:message>
        <form:input path="name"></form:input>
        <form:errors class="error" path="name"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.email.label"></spring:message>
        <form:input path="email"></form:input>
        <form:errors class="error" path="email"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.age.label"></spring:message>
        <form:input path="age"></form:input>
        <form:errors class="error" path="age"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.birthday.label"></spring:message>
        <form:input path="birthday"></form:input>
        <form:errors class="error" path="birthday"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.role.label"></spring:message>
        <form:select path="role">
            <form:option value="">Select Role</form:option>
            <form:options items="${roles}"></form:options>
        </form:select>
        <form:errors class="error" path="role"></form:errors>
    </p>
    
    <p><spring:message code="userForm.address.label"></spring:message></p>
    
    <p>
        <spring:message code="userForm.address.street.label"></spring:message>
        <form:input path="addr.street"></form:input>
        <form:errors class="error" path="addr.street"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.address.state.label"></spring:message>
        <form:input path="addr.state"></form:input>
        <form:errors class="error" path="addr.state"></form:errors>
    </p>
    
    <p>
        <spring:message code="userForm.address.zipCode.label"></spring:message>
        <form:input path="addr.zipCode"></form:input>
        <form:errors class="error" path="addr.zipCode"></form:errors>
    </p>
    
    <p>
        <input type="submit" value="<spring:message code="userForm.address.addButton.label"/>">
    </p>

</form:form>
</body>
</html>
