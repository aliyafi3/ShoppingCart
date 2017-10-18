<%-- 
    Document   : nextpage
    Created on : Oct 17, 2017, 9:49:36 AM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Halaman Next</h1>
        <b>${user.username}</b><br/>
        <c:forEach items="${user.carts}" var="c">
            ${c} <br/> 
        </c:forEach>
        <br/>
        <a href="logout">logout</a>
    </body>
</html>
