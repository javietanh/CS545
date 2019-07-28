<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Product Details</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css"
          href="<spring:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />">
    <link rel="stylesheet" type="text/css"
          href="<spring:url value="/css/style.css"/>">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="text-center">
<div class="form col-8">
    
    <h1 class="h3 mb-3 font-weight-bolder text-left"><spring:message
            code="page.title.product.detail"></spring:message></h1>
    
    <p class="m-2"></p>
    
    <table class="table table-bordered">
        <tr>
            <td class="text-left w-25"><spring:message code="product.list.name"/></td>
            <td class="text-left">${product.name}</td>
        </tr>
        <tr>
            <td class="text-left"><spring:message code="product.list.description"></spring:message></td>
            <td class="text-left">${product.description}</td>
        </tr>
        <tr>
            <td class="text-left"><spring:message code="product.list.price"></spring:message></td>
            <td class="text-left">${product.price}</td>
        </tr>
        <tr>
            <td class="text-left"><spring:message code="product.list.category"></spring:message></td>
            <td class="text-left">${product.category.name}</td>
        </tr>
    </table>
    
    <div class="col-sm-10 text-left">
        <spring:url var="back" value="/"></spring:url>
        <a href="${back}" class="btn btn-primary btn-lg"><spring:message
                code="product.back.button"></spring:message></a>
    </div>
    
    <p class="mt-5 mb-3 text-muted"><spring:message code="copyright"></spring:message></p>
</div>
</body>
</html>
