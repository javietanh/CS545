<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/27/2019
  Time: 10:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Registration</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="btn btn-outline-primary" href="<c:url value="/"/>">Home</a>
    </nav>
</div>

<div class="container">
    
    <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-left">
        <h1 class="display-4"><strong>Registration</strong></h1>
    </div>
    
    <form:form class="col-lg-6" modelAttribute="student">
        
        <form:errors path="*" cssClass="error-block" element="div"/>
        
        <div class="form-group">
            <label for="firstName">First Name:</label>
            <form:input path="firstName" class="form-control"></form:input>
            <form:errors path="firstName" class="error"/>
        </div>
        <div class="form-group">
            <label for="lastName">Last Name:</label>
            <form:input path="lastName" class="form-control"></form:input>
            <form:errors path="lastName" class="error"/>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <form:input path="email" class="form-control"></form:input>
            <form:errors path="email" class="error"/>
        </div>
        <div class="form-group">
            <label for="gender">Gender:</label>
            <form:select path="gender" class="custom-select">
                <form:option value="">Select Gender</form:option>
                <form:option value="Male">Male</form:option>
                <form:option value="Female">Female</form:option>
            </form:select>
            <form:errors path="gender" class="error"/>
        </div>
        <div class="form-group">
            <label for="birthday">Birthday:</label>
            <form:input path="birthday" class="form-control"></form:input>
            <form:errors path="birthday" class="error"/>
        </div>
        <div class="form-group mb-0">
            <label>Phone:</label>
        </div>
        <div class="input-group col-lg-6 text-left pl-0">
            <form:input path="phone.area" maxlength="3" class="form-control"></form:input>
            <form:input path="phone.prefix" maxlength="3" class="form-control"></form:input>
            <form:input path="phone.number" maxlength="4" class="form-control"></form:input>
        </div>
        <div class="form-group mb-0">
            <form:errors path="phone.area" class="error"/>
        </div>
        <div class="form-group mb-0">
            <form:errors path="phone.prefix" class="error"/>
        </div>
        <div class="form-group mb-0">
            <form:errors path="phone.number" class="error"/>
        </div>
        
        <button type="submit" class="btn btn-primary btn-block btn-lg mt-4">Submit</button>
    </form:form>

</div>

</body>
</html>
