<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset='utf-8'>
    <title>Siorsys</title>
</head>
<body>
<div class="main">
    <div class="login-form">
        <h1>Welcome</h1>
        <div class="head">
            <img src="<c:url value="/resources/images/user.png"/>"/>
        </div>
        <form action="#" method="post">
            <input name="login" type="text" class="text" value="USERNAME" onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'USERNAME';}">
            <input name="pass" type="password" value="Password" onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'Password';}">
            <div class="submit">
                <input type="submit" value="LOGIN">
            </div>
            <p><a href="#">Forgot Password ?</a></p>
        </form>
    </div>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/login-style.css"/>"/>
</html>
