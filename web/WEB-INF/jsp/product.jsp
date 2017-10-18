<%-- 
    Document   : product
    Created on : Oct 17, 2017, 3:04:52 PM
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
    <center><h1>List Product</h1></center>
        <table border="3" align="center" >
           <c:forEach var="c" items="${products}">
               <tr>
                   <th>Name</th>
                   <th>Action</th>
               </tr>
            <tr>
                    <td>${c.name}</td>          
                    <td><a href="${c.id}">Detail Product</a></td>
            </tr>
        </c:forEach>
</table>
    </body>
</html>
