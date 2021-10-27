<%--
  Created by IntelliJ IDEA.
  User: arisa
  Date: 25/10/2021
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Student Registration Page</h1>
    <form action="<%= request.getContextPath() %>/StudentServlet" method = "post">
        First Name: <input type="text" name="firstName">
        <br>
        Last Name: <input type="text" name="lastName">
        <br>
        Email ID: <input type="email" name="emailId">
        <br>
        Password: <input type="password" name="password">
        <br><br>
        <input type="submit" value="register">
    </form>

</body>
</html>
