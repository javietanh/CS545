<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">


    <div class="mx-auto m-5">
        <div class="m-5 col-lg-8">
            <c:if test="${errors != null}">
                <div class="alert alert-danger" role="alert">
                    <h2>Error(s)!</h2>
                    <ul>
                        <c:forEach var="error" items="${errors}">
                            <li>${error}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>

            <h1>Calculator</h1>
            <hr/>
            <form action="compute" method="post">
                <div class="form-row align-items-center">
                    <div class="col-auto">
                        <label class="sr-only" for="add1">add1</label>
                        <input type="text" class="form-control mb-2"  id="add1" name="add1">
                    </div>
                    <div class="col-auto">
                        <label>+</label>
                    </div>
                    <div class="col-auto">
                        <label class="sr-only" for="add2">add2</label>
                        <input type="text" class="form-control mb-2"  id="add2" name="add2">
                    </div>
                </div>

                <div class="form-row align-items-center">
                    <div class="col-auto">
                        <label class="sr-only" for="mult1">mult1</label>
                        <input type="text" class="form-control mb-2"  id="mult1" name="mult1">
                    </div>
                    <div class="col-auto">
                        <label class="ml-1">*</label>
                    </div>
                    <div class="col-auto">
                        <label class="sr-only" for="mult2">mult2</label>
                        <input type="text" class="form-control mb-2"  id="mult2" name="mult2">
                    </div>
                </div>

                <div class="form-row align-items-center text-center">
                    <button type="submit" class="btn btn-primary btb-lg btn-block">Calculate</button>
                </div>

            </form>
        </div>
    </div>

</div>
</body>
</html>
