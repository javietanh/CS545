<%--
  Created by IntelliJ IDEA.
  User: rxing
  Date: 7/25/2019
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${categories}" var="category">
    ${category.name}
</c:forEach>

<p>
    Book ID: ${savedBook.id}

</p>
<p>
    Book Title: ${savedBook.title}
</p>

<p>
    Book ISBN: ${savedBook.isbn}
</p>

</body>
</html>
