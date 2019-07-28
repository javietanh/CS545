<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculator</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="global">

    <c:if test="${errors != null}">

        <p id="errors">
            Error(s)!
        <ul>
            <c:forEach var="error" items="${errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>


    </c:if>


    <form action="calculator_compute" method="post">
        <fieldset>
            <legend>Calculator</legend>
            <p>
                <input name="add1" size="5" value="${calculator.add1}"> + <input name="add2" size="5" value="${calculator.add2}"> = <input name="sum" size="5" value="${calculator.sum}" readonly>
            </p>

            <p>
                <input name="mult1" size="5" value="${calculator.mult1}"> * <input name="mult2" size="5" value="${calculator.mult2}"> = <input name="product" size="5" value="${calculator.product}" readonly>
            </p>

            <p>
                <button type="submit" value="Calculate">Calculate</button>
            </p>
        </fieldset>
    </form>


</div>
</body>
</html>
