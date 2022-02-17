<%-- 
    Document   : header
    Created on : Dec 3, 2021, 6:48:49 PM
    Author     : duonghuuthanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Bus Navbar</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <c:forEach var="c" items="${Tuyen}">      
      <li>
          <c:url value="/" var="catPath">
              <c:param name="TuyenId" value ="${c.Id}"></c:param>
          </c:url>
          <a href="${catPath}">${c.noiDenid}</a>
      </li>
      </c:forEach>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
