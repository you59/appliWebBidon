<%-- 
    Document   : _MENU
    Created on : 17 juin 2016, 10:55:05
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul>
    <li><a href="films_liste" class="menu_click">Films</a></li>
    
    <li><a href="series_liste" class="menu_click">Séries</a></li>
    
    <c:choose>
        <c:when test="${cookie.login==null}">
            <li><a href="home" class="menu_click">Connection</a></li>
        </c:when>
        <c:otherwise>
            <c:if test="${cookie.userRight.getValue()=='ADMIN'}">
                <li><a href="creation_serie" class="menu_click">Ajout Série</a></li>
                <li><a href="creation_film" class="menu_click">Ajout Films</a></li>
            </c:if>
        
            <li><a href="logout" class="menu_click">Déconnection</a></li>
            <li><a href="stylesheet" class="menu_click">Style du site</a></li>
        </c:otherwise>
    </c:choose>
</ul>
