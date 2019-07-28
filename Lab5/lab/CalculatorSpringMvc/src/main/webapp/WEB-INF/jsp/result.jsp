<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/27/2019
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="mx-auto m-5">
        <div class="m-5 col-lg-8">
            <c:if test="${cal ne null}">
                <p>
                    <h1>Result:</h1>
                </p>
                <p>
                        ${cal.add1} + ${cal.add2} = ${cal.sum}
                </p>
                <p>
                        ${cal.mult1} * ${cal.mult2} = ${cal.product}
                </p>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
