<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
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
                <input type="submit" class="agreebtn" value="Logout"/>
            </form>
            <br>
        </div>
        <hr>
        <br>
        <div id="navigation">
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
                <c:when test="${cart.size()<6}">
                    <c:forEach var="food" items="${cart}">
                        <br><c:out value="${food.title}"/>
                    </c:forEach>
                </c:when>
            </c:choose>
            <div id="check" class="modal">
                <form class="modal-content animate" action="#">
                    <div class="container" style="background-color: #f1f1f1">
                        <br>
                        <c:forEach var="item" items="${cart}">
                            <div class="chelement">
                                    <span class="name">
                                        <c:out value="${item.title}"/>
                                    </span>
                                    <span class="price">
                                    <c:out value="${item.price}"/> грн.<br>
                                        </span>
                            </div>
                        </c:forEach>
                        <br>
                        <hr>
                        <br>
                        Всего к оплате: <strong><c:out value="${total}"/> </strong> грн.
                        <br><br>
                        <button type="button" class="agreebtn" onclick="window.location.href='/checkout'">Оформить</button>
                        <button type="button" class="cancelbtn"
                                onclick="document.getElementById('check').style.display='none'">Закрыть
                        </button>
                    </div>

                </form>
            </div>
            <button type="button" onclick="document.getElementById('check').style.display='block'"> Показать чек
            </button>
            <form action="/clear-cart">
                <input type="submit" class="cancelbtn" style="width: 100%" value="Обнулить чек"/>
            </form>

        </div>
    </div>
    <div id="menu">
        <c:forEach var="item" items="${menu}">
            <div id="element">
                <div class="tooltip">
                <h3><c:out value="${item.title}"/></h3>
                  <span class="tooltiptext">
                       <span style="float:left;"> Стоимость: </span><c:out value="${item.price}"/><br>
                        <span style="float:left;"> В наличии:</span> <c:out value="${item.count}"/><br>
                        <span style="float:left;"> Ингридиенты: <c:out value="${item.ingredients}"/></span><br>
                   </span>
                </div>
                <form action="addProduct-${item.id}" method="post">
                    <button id="img" style="padding: 0">
                        <img width="250px" height="167px" src="<c:url value="/resources/images/${item.image}"/>"/>

                    </button>
                    <br>
                </form>

            </div>
        </c:forEach>
    </div>
</div>
<script>
    var modal = document.getElementById('check');
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = 'none';
        }
    };

</script>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/modal.css"/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
<link type="text/css" rel="script" href="<c:url value="/resources/js/script.js"/>"/>
</html>
