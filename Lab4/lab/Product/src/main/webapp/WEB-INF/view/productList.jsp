<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <title>Product List</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css"
          href="<spring:url value="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />">
    <link rel="stylesheet" type="text/css"
          href="<spring:url value="css/style.css"/>">
    <script src="webjars/jquery/jquery.min.js"></script>
    <script src="webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="text-center">
<div class="form col-8">
    
    <h1 class="h3 mb-3 font-weight-bolder text-left"><spring:message
            code="page.title.productList"></spring:message></h1>
    
    <p class="m-2"></p>
    
    <table class="table table-bordered">
        <tr>
            <th><spring:message code="product.list.name"></spring:message></th>
            <th><spring:message code="product.list.category"></spring:message></th>
            <th><spring:message code="product.list.description"></spring:message></th>
            <th>
                <spring:url value="add" var="add"></spring:url>
                <a href="${add}"><spring:message code="product.list.add.button"></spring:message></a>
            </th>
        </tr>
        
        <c:forEach var="product" items="${products}">
            <tr>
                <td>
                    <spring:url value="detail/{id}" var="detail">
                        <spring:param name="id" value="${product.id}"/>
                    </spring:url>
                    <a href="${detail}">${product.name}</a>
                </td>
                <td>${product.category.name}</td>
                <td>${product.description}</td>
                <spring:url value="edit/{id}" var="edit">
                    <spring:param name="id" value="${product.id}"/>
                </spring:url>
                <spring:url value="delete/{id}" var="delete">
                    <spring:param name="id" value="${product.id}"/>
                </spring:url>
                <td>
                    <a href="${edit}"><spring:message code="product.list.edit.button"></spring:message></a>
                    |
                    <a href="${delete}"><spring:message code="product.list.delete.button"></spring:message></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    
    <p class="mt-5 mb-3 text-muted"><spring:message code="copyright"></spring:message></p>
</div>
</body>
</html>
