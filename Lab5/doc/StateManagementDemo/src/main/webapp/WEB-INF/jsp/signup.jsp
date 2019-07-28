<%--
  Created by IntelliJ IDEA.
  User: rxing
  Date: 7/26/2019
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user">
    <p>UserName: <form:input path="username" /></p>
    <p>Password: <form:password path="password" /></p>
    <p>Email: <form:input path="email" /></p>
    <input type="submit" value="Signup"/>
</form:form>

</body>
</html>
