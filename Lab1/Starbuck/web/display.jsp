<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/22/2019
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Display advice result list.</title>
</head>
<body>
<h2>Starbucks ${roast} Roast Coffees:</h2>
<p>
<ul>
    <c:forEach var="i" items="${advices}">
        <li><c:out value="${i}"></c:out></li>
    </c:forEach>
</ul>
</p>
</body>
</html>
