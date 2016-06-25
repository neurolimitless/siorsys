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

<body style="background-color: darkgray">
<div style="text-align: center"  id="main">
    <h2>Welcome to admin-menu</h2>
    <br>
    <a href="/menu">Back</a>
    <br><br>
    <div id="users">
        <table >
            <thead>
            <th>Login</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Pass</th>
            <th>Email</th>
            <th>Role</th>
            </thead>
            <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td><c:out value="${user.login}"/></td>
                    <td><c:out value="${user.firstName}"/></td>
                    <td><c:out value="${user.lastName}"/></td>
                    <td><c:out value="${user.pass}"/></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.role}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <br><br>
    <div id="food">
        <table>
            <thead>
            <th>Title</th>
            <th>Ingredients</th>
            <th>Price</th>
            <th>Count</th>
            <th>Type</th>
            <th>Total Ordered</th>
            <th>Image</th>
            </thead>
            <tbody>
            <c:forEach var="food" items="${food}">
            <tr>
                <td><c:out value="${food.title}"/></td>
                <td><c:out value="${food.ingredients}"/></td>
                <td><c:out value="${food.price}"/></td>
                <td><c:out value="${food.count}"/></td>
                <td><c:out value="${food.type}"/></td>
                <td><c:out value="${food.totalOrdered}"/></td>
                <td><c:out value="${food.image}"/></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</html>
