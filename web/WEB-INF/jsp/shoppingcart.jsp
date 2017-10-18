<%-- 
    Document   : shoppingcart
    Created on : Oct 17, 2017, 5:36:13 PM
    Author     : user
--%>
<%@ page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>Shopping Cart</h1>
            Jumlah Belanjaan : ${p.size()}
            <table border="3" align="center">
                <tr>
                <th>ID Product</th>
                <th>Name Product</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            <c:forEach var="pr" items="${p}">
                <td>${pr.id}</td>
                <td>${pr.name}</td>
                <td>${pr.price}</td>
            </c:forEach>
                <td><a href="${pageContext.request.contextPath}/products/list">Continue Buy</a></td>
            </table>
        </div>
    </body>
</html>
