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
<body id="login-page">
<br><br><br>
<div id="login-form" ><h1>Welcome to Siorsys</h1>
    <br><br>
    <br><br>
    <div class="panel-right">
    <form:form method="post" action="#">
        <input type="text" name="login" placeholder="Login"/><br>
        <input type="password" name="pass" placeholder="Password"/><br>
        <div style="font-size: small">
            <input type="submit" class="button" value="Enter"/><br>
        </div>
    </form:form>
    </div>
    <br>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</html>
