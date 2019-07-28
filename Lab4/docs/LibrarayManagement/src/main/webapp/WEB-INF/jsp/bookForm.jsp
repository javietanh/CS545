<%--
  Created by IntelliJ IDEA.
  User: rxing
  Date: 7/25/2019
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">

    <form:form method="post" modelAttribute="book">
        <p>
            <spring:message code="book.title" text="My BOOK TITLE: "/> <form:input path="title"/>
        </p>

        <p>
            <spring:message code="book.isbn"/> <form:input path="isbn"/>
        </p>

        <p>
            <spring:message code="book.category"></spring:message>

            <form:select multiple="true" path="categories" items="${categories}" itemLabel="name" itemValue="id" ></form:select>
<%--        <form:select path="category.id">--%>
<%--            <form:option value="-1">Please select a category</form:option>--%>
<%--            <form:options items="${categories}" itemValue="id" itemLabel="name"></form:options>--%>
<%--        </form:select>--%>

<%--            <form:select path="category.id" items="${categories}" itemLabel="name"/>--%>

        </p>

        <input type="submit" value="Add a Book">

    </form:form>


</div>

</body>
</html>
