<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>Authentication</title>
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
<form class="form form-login" action="login" method="post">
    <img class="mb-4"
         src="resources/img/starbucks.png"
         alt="" height="180">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    
    <label for="name" class="sr-only">Name</label>
    <input type="text" id="name" name="name" class="form-control"
           placeholder="Name" required autofocus>
    <p class="m-0 mt-2"></p>
    <label for="password" class="sr-only">Password</label>
    <input type="password" id="password" name="password" class="form-control"
           placeholder="Password" required>
    
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in
    </button>
    
    <c:if test="${errors != null}">
        <div class="alert alert-danger mt-4 text-left" role="alert">
            <h2>Error(s)!</h2>
            <ul>
                <c:forEach var="error" items="${errors}">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </div>
    </c:if>
    
    <p class="mt-5 mb-3 text-muted">&copy; 2019-2020</p>
</form>
</body>
</html>
