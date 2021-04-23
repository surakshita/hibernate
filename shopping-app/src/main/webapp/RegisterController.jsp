<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<link rel="stylesheet" href="css/register.css" type="text/css">
</head>
<body bgcolor="DarkCyan">
<header>SHOPPING</header>
<div class="wrapper">
<div class="tittle">Register</div>
<form action="register.do" method="get">
<div class="form">
<div class="input_field">
<label>USERNAME:</label>
<input type="text" name="username">
</div>
<div class="input_field">
<label>EMAIL:</label>
<input type="email" name="email">
</div>
<div class="input_field">
<label>PHONE NUMBER:</label>
<input type="number" name="phoneNumber">
</div>
<div class="input_field">
<label>PASSWORD:</label>
<input type="password" name="password">
</div>
<div class="submit_field">
<input type="submit" value="register" class="btn" >
</div>
</div>
</form>
</div>
 <h3>Message:${message}</h3>
 
 <footer>&COPY;2021</footer>
</body>
</html>