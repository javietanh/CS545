<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Compare Generated Numbers</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <form method="post" action="CompareServlet">
        <button type="submit">Generate Number</button>
    </form>
    <br/>
    <div class="area">
        <h2>And the results are:</h2>
        <br/>
        <c:choose>
            <c:when test="${num1 lt numControl }">
                <div class="lt">The number ${num1} is less than ${numControl}</div>
            </c:when>
            <c:when test="${num2 gt numControl }">
                <div class="gt">The number ${num2} is greater than ${numControl}</div>
            </c:when>
            <c:when test="${num3 eq numControl }">
                <div class="eq">The number ${num3} is equal to ${numControl}</div>
            </c:when>
            <c:otherwise>
                <p class="normal">The number ${numControl}</p>
                <p class="gt">is NOT greater than ${num1}</p>
                <p class="lt">is NOT less than ${num2}</p>
                <p class="eq">is NOT equal to ${num3}</p>
            </c:otherwise>
        </c:choose>
    </div>

</body>
</html>
