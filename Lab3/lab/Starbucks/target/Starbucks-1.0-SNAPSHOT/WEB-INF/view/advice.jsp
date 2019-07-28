<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>Starbucks Advice</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/css/style.css" />">
    <script src="webjars/jquery/3.4.1/jquery.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
</head>
<body class="text-center">
<form class="form form-advice" action="advice" method="post">
    <img class="mb-4"
         src="resources/img/starbucks.png"
         alt="" height="180">
    
    <div class="col-6 mx-auto">
        <h3 class="h3 mb-3 font-weight-normal">Ask for advice about your
            favorite
            roast:</h3>
        
        <select id="roast" name="roast" class="custom-select">
            <option value="-">--Choose Roast--</option>
            <option value="dark" ${roast.roast == 'dark' ?  'selected' : ''}>
                Dark
            </option>
            <option value="medium" ${roast.roast == 'medium' ?  'selected' : ''}>
                Medium
            </option>
            <option value="light" ${roast.roast == 'light' ?  'selected' : ''}>
                Light
            </option>
        </select>
        
        <p class="m-0 mt-2"></p>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit
        </button>
    </div>
    
    <p class="m-0 mt-2"></p>
    
    <c:if test="${advices != null}">
        <ul class="list-group mt-5">
            <li class="list-group-item list-group-item-info">Starbucks ${roast.roast} Roast Coffees:</li>
            <c:forEach var="i" items="${advices}">
                <li class="list-group-item text-left">${i}</li>
            </c:forEach>
        </ul>
    </c:if>
    
    <p class="m-0 mt-2"></p>
    <p class="mt-5 mb-3 text-muted">&copy; 2019-2020</p>
</form>
</body>
</html>
