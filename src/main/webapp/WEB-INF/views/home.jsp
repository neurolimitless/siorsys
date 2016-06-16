<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="utf-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset='utf-8'>
    <title>Siorsys</title>
</head>
<body>
<div id="some" align="center"><h1>zdarova dalbaeb</h1>
    <br><br>
    <img src="http://rs826.pbsrc.com/albums/zz186/willisnowell/Gifs/monkey_making_funny_face_hg_clr.gif~c200"/>
    <br><br>
    <form method="post">
        <input type="text" name="login" placeholder="Login"/><br>
        <input type="password" name="pass" placeholder="Password"/><br>
        <div style="font-size: small">
            <input type="submit" value="Enter"/><input type="checkbox">Remember</input> <br>
        </div>
    </form>
    <br>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</html>
