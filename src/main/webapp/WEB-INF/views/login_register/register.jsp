<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>Registr Page</title>
</head>
<body>
<h1>Spring Boot - MVC web application example</h1>
<hr>

<div class="form">
    <form action="login" method="post" onsubmit="return validate()">
        <table>
            <tr>
                <td>Enter Your name:</td>
                <td><input id="name" name="name"></td>
            </tr>
            <tr>
                <td>Enter Your login:</td>
                <td><input id="login" name="login"></td>
            </tr>
            <tr>
                <td>Enter Your password:</td>
                <td><input id="password" name="password"></td>
            </tr>

            <td><input type="submit" value="Register" name="do_register"></td>

            <tr>
                <td>${info}</td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>