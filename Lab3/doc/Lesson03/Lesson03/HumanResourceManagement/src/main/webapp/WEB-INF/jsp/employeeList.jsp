<%--
  Created by IntelliJ IDEA.
  User: rxing
  Date: 7/24/2019
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
<table class="table">
    <thead>
    <tr>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Salary</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${employeeList}">
    <tr>
       <td> <a href="<c:url value='/emp/lists/${emp.firstName}' /> ">${emp.firstName}</a></td>
        <td><a href="<c:url value='/emp/lists2?lastName=${emp.lastName}' /> ">${emp.lastName}</a></td>
        <td>${emp.salary}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
