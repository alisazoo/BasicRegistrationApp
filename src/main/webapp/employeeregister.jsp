<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Register</title>
</head>
<body>
    <div style="width:800px;margin:0 auto;">
        <h1>Employee Register Form</h1>
<!--        <form action="register" method="post">-->
        <form action = "<%= request.getContextPath() %>/EmployeeDao" method = "post">
        <table style="width: 80%">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" /></td>
                </tr>
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" /></td>
                </tr>
                <tr>
                    <td>Contact No</td>
                    <td><input type="text" name="contact" /></td>
                </tr>
            </table>
            <input type="submit" value="Submit" />
        </form>
    </div>

</body>
</html>