<%-- 
    Document   : index
    Created on : Dec 9, 2021, 2:52:49 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pasge</title>
    </head>
    <body>
        <ul>
            <c:forEach var="ben" items="${benxe}" >
                <li>${ben.idBenXe} - ${ben.diaChi}</li>    
            </c:forEach>
            
        </ul>
        <h1>Hello World!</h1>
    </body>
</html>
