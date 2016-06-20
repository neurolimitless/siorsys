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
<div id="content">
    <div id="panel">
        <div id="user">
            <span>Logged as: </span><c:out value="${username}"/><br>
            <form action="/logout"><br>
                <input type="submit" value="Logout"/>
            </form><br>
            <form action="/getinfo">
                <input type="button" value="Info"/>
            </form><br>
        </div>
    </div>
    <div id="menu">
        <c:forEach var="item" items="${menu}">
            <div id="element">
                <h3><c:out value="${item.title}"/></h3><br>
                <img width="250px" height="167px" src="<c:url value="/resources/images/${item.image}"/>"/><br>
                    <%--Стоимость: <c:out value="${item.price}"/><br>--%>
                    <%--В наличии: <c:out value="${item.count}"/><br>--%>
                    <%--Ингридиенты: <c:out value="${item.ingredients}"/><br>--%>
            </div>
        </c:forEach>
    </div>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</html>
