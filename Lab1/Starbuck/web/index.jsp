<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/22/2019
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Starbucks</title>
</head>
<body>
<fieldset>
    <legend>Login</legend>
    <form action="action/login" method="post" autocomplete="off">
        <p>
            Name: <input type="text" name="name" size="9" placeholder="name" autocomplete="off"/>
        </p>
        <p>
            Password: <input type="password" name="password" size="9" placeholder="password" autocomplete="off"/>
        </p>
        <p>
            <input type="submit" value="Log In"/>
        </p>
        <p style="color: red;">
            ${error}
        </p>
    </form>
</fieldset>
</body>
</html>
