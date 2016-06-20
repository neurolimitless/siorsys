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

            <span>Logged as: </span>
            <c:choose>
                <c:when test="${admin}">
                    <a href="<c:out value="/admin"/>"><c:out value="${username}"/></a>
                </c:when>
                <c:otherwise>
                    <c:out value="${username}"/>
                </c:otherwise>
            </c:choose>

            <br>
            <form action="/logout"><br>
                <input type="submit" value="Logout"/>
            </form>
            <br>
            <form action="/getinfo">
                <input type="button" value="Info"/>
            </form>
            <br>
        </div>
        <hr>
        <br>
        <div id="navigation">
            <a href="/load-complex">Комплексные обеды</a><br> <br>
            <a href="/load-first">Первое</a><br> <br>
            <a href="/load-second">Второе</a><br> <br>
            <a href="/load-salads">Салаты</a><br> <br>
            <a href="/load-drink">Напитки</a><br> <br>
            <a href="/load-other">Дополнительное</a><br> <br>
        </div>
        <hr>
        <div id="checkout">
            <br>
            <h5>Чек:</h5>
            <form action="/checkout">
                <input type="submit" value="Показать чек"/>
            </form>
            <input type="button" value="Обнулить чек"/>
        </div>
    </div>
    <div id="menu">
        <c:forEach var="item" items="${menu}">
            <div id="element">
                <h3><c:out value="${item.title}"/></h3>
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
