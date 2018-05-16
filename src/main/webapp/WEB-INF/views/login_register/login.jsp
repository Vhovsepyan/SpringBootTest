<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>Login Page</title>
</head>
<body>
<h1>Spring Boot - MVC web application example</h1>
<hr>

<div class="form">
    <form action="profile" method="post" onsubmit="return validateLogin()">
        <table>
            <tr>
                <td>Login :</td>
                <td><input id="name" name="name"></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input id="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login" name="login"></td>
            </tr>
        </table>
    </form>
    <form action="register" method="post" >
        <table>
            <tr>
                <td><input type="submit" value="Register" name="register"></td>
            </tr>

            <tr>
                <td>${info}</td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>