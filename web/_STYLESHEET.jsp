<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:13
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:choose>
    <c:when test="${cookie.choixStyle.getValue() == 'pony'}">
        <link href="CSS/pony.css" rel="stylesheet" type="text/css"/>
    </c:when>
        
    <c:when test="${cookie.choixStyle.getValue() == 'drag'}">
        <link href="CSS/dragon.css" rel="stylesheet" type="text/css"/>
    </c:when>
        
    <c:otherwise>
        <link href="CSS/pony.css" rel="stylesheet" type="text/css"/>
    </c:otherwise>
</c:choose>