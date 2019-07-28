<%--
  Created by IntelliJ IDEA.
  User: rxing
  Date: 7/24/2019
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Add a new Employee</h1>
<form action="add" method="post">
    <div class="form-group">
        <label for="firstName">First Name</label>
        <input type="text" class="form-control" id="firstName" name="firstName">
    </div>
    <div class="form-group">
        <label for="lastName">Last Name</label>
        <input class="form-control" id="lastName" name="lastName">
    </div>
    <div class="form-group">
        <label for="salary">Salary</label>
        <input class="form-control" id="salary" name="salary">
    </div>

    <p>Address: </p>
    <div class="form-group">
        <label for="street">Street</label>
        <input class="form-control" id="street" name="address.street">
    </div>

    <div class="form-group">
        <label for="zipCode">Zip Code</label>
        <input class="form-control" id="zipCode" name="address.zipCode">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>
