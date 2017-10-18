<%-- 
    Document   : productdetail
    Created on : Oct 17, 2017, 3:21:15 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Product</title>
    </head>
    <body>
    <center><h1>Detail Product</h1></center>
        <table border="3" align="center">
            <tr>
                <th>ID Product</th>
                <th>Name Product</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            <tr>
                <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td><a href="shoppingcart/${product.id}">Masukkan ke keranjang</a></td>
        </tr>
</table>
    </body>
</html>
