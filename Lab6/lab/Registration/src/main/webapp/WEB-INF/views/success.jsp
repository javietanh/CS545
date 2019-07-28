<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration Successful.</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Registration</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="btn btn-outline-primary" href="<c:url value="/"/>">Home</a>
    </nav>
</div>

<div class="container">
    
    <c:if test="${ student.firstName ne null }">
        <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-left">
            <h1 class="display-4 text-success"><strong>Registration Successful.</strong></h1>
            <p class="lead font-italic">Congratulation, your registration process finish successful.</p>
        </div>
        
        <div class="col-lg-6 border border-success p-4">
            <textarea style="border: none" rows="10" cols="30">${student}</textarea>
        </div>
    </c:if>
</div>

</body>
</html>
