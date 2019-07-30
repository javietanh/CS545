<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Employee Form</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>

<div id="global">
    <div class="">
        <a href="<c:url value="/employee_save?lang=en"/>">English</a> | <a
            href="<c:url value="/employee_save?lang=fr"/>">French</a>
    </div>
    
    <p>
        &nbsp;
    </p>
    
    <form:form modelAttribute="employee" action="employee_save" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend>
                <spring:message code="emp.form.title"></spring:message>
            </legend>
            <p>
                <form:errors path="*" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="id">
                    <spring:message code="emp.add.id.label"></spring:message>
                </label>
                    <form:input path="id" id="id"/>
            <div style="text-align: center;">
                <form:errors path="id" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="firstName">
                    <spring:message code="emp.add.firstName.label"></spring:message>
                </label>
                    <form:input path="firstName"/>
            <div style="text-align: center;">
                <form:errors path="firstName" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="lastName">
                    <spring:message code="emp.add.lastName.label"></spring:message>
                </label>
                    <form:input path="lastName"/>
            <div style="text-align: center;">
                <form:errors path="lastName" cssStyle="color : red;"/>
            </div>
            </p>
            
            <p>
                <label for="birthDate">
                    <spring:message code="emp.add.birthday.label"></spring:message>
                </label>
                <form:input path="birthDate" id="birthDate"/>
                <form:errors path="birthDate" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="salaryLevel">
                    <spring:message code="emp.add.salary.label"></spring:message>
                </label>
                    <form:input path="salaryLevel" id="salaryLevel"/>
            <div style="text-align: center;">
                <form:errors path="salaryLevel" cssStyle="color : red;"/>
            </div>
            </p>
            <h4>
                <spring:message code="emp.add.address.label"></spring:message>
            </h4>
            <p>
                <label for="street">
                    <spring:message code="emp.add.street.label"></spring:message>
                </label>
                    <form:input path="address.street" id="street"/>
            <div style="text-align: center;">
                <form:errors path="address.street" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="state">
                    <spring:message code="emp.add.state.label"></spring:message>
                </label>
                    <form:input path="address.state" id="state"/>
            <div style="text-align: center;">
                <form:errors path="address.state" cssStyle="color : red; "/>
            </div>
            </p>
            <p>
                <label for="zipCode">
                    <spring:message code="emp.add.zip.label"></spring:message>
                </label>
                    <form:input path="address.zipCode" id="zipCode"/>
            <div style="text-align: center;">
                <form:errors path="address.zipCode" cssStyle="color : red; "/>
            </div>
            </p>
            <p>
                <label for="picture">
                    <spring:message code="emp.add.picture.label"></spring:message>
                </label>
                    <form:input path="picture.content" id="picture" type="file"/>
            <div style="text-align: center;">
                <form:errors path="picture.content" cssStyle="color : red; "/>
            </div>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5"
                       value="<spring:message code="emp.add.submit.button"></spring:message>">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
