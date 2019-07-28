<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 7/22/2019
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p/>
<form action="action/advice" method="post">
    <select name="roast">
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
