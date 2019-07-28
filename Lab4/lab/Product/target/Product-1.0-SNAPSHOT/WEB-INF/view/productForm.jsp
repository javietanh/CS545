<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Product Add/Edit</title>
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
            code="page.title.productAddEdit"></spring:message></h1>
    
    <p class="m-2"></p>
    
    <div class="table table-bordered text-left p-5 bg-light">
        
        <spring:url value="/save/{id}" var="saveProduct">
            <spring:param name="id" value="${product.id}"/>
        </spring:url>
        
        <form:form modelAttribute="product" method="post" action="${saveProduct}">
            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label"><spring:message code="product.list.name"/></label>
                <div class="col-sm-10">
                    <form:input path="name" class="form-control"></form:input>
                </div>
            </div>
            <div class="form-group row">
                <label for="description" class="col-sm-2 col-form-label"><spring:message
                        code="product.list.description"></spring:message></label>
                <div class="col-sm-10">
                    <form:input path="description" cssClass="form-control"></form:input>
                </div>
            </div>
            <div class="form-group row">
                <label for="price" class="col-sm-2 col-form-label"><spring:message
                        code="product.list.price"></spring:message></label>
                <div class="col-sm-10">
                    <form:input path="price" cssClass="form-control"></form:input>
                </div>
            </div>
            <div class="form-group row">
                <label for="category" class="col-sm-2 col-form-label"><spring:message
                        code="product.list.category"></spring:message></label>
                <div class="col-sm-10">
                    <form:select cssClass="form-control custom-select" path="category">
                        <form:option value="">Please select product category.</form:option>
                        <form:options items="${categories}" itemValue="id" itemLabel="name"></form:options>
                    </form:select>
                </div>
            </div>
            
            <div class="form-group row pt-4">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary btn-lg"><spring:message
                            code="product.submit.button"></spring:message></button>
                </div>
            </div>
        </form:form>
    </div>
    
    <p class="mt-5 mb-3 text-muted"><spring:message code="copyright"></spring:message></p>
</div>
</body>
</html>
