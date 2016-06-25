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
            <a href="/menu?type=0">Комплексные обеды</a><br> <br>
            <a href="/menu?type=1">Первое</a><br> <br>
            <a href="/menu?type=2">Второе</a><br> <br>
            <a href="/menu?type=3">Салаты</a><br> <br>
            <a href="/menu?type=4">Напитки</a><br> <br>
            <a href="/menu?type=5">Дополнительное</a><br> <br>
        </div>
        <hr>
        <div id="checkout">
            <br>
            <h5>Чек:</h5>
            <c:out value="${cart.size()}"/> - позиций.<br>
            Всего: <c:out value="${total}"/>
            <c:choose>
            <c:when test="${cart.size()<7}">
            <c:forEach var="food" items="${cart}">
                <br><c:out value="${food.title}"/>
            </c:forEach>
            </c:when>
            </c:choose>
            <form action="/checkout">
                <input type="submit" value="Показать чек"/>
            </form>
            <form action="/clear-cart">
                <input type="submit" value="Обнулить чек"/>
            </form>

        </div>
    </div>
    <div id="menu">
        <c:forEach var="item" items="${menu}">
            <div id="element">
                <form method="post" action="addProduct-${item.id}">
                <h3 id="name"><c:out value="${item.title}"/></h3>
                <button>
                    <img width="250px" height="167px" src="<c:url value="/resources/images/${item.image}"/>"/>
                </button><br>
                    <%--Стоимость: <c:out value="${item.price}"/><br>--%>
                    <%--В наличии: <c:out value="${item.count}"/><br>--%>
                    <%--Ингридиенты: <c:out value="${item.ingredients}"/><br>--%>

                </form>
            </div>
        </c:forEach>
    </div>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
<link type="text/css" rel="script" href="<c:url value="/resources/js/script.js"/>"/>
</html>
