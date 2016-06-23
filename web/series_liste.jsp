<%-- 
    Document   : series_liste
    Created on : 17 juin 2016, 11:17:10
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"></c:import>
    </head>
    <body>
        
        <div class="titre">
            <c:import url="_TITRE.jsp" />
        </div>
            
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        
        <div class="contenu">
            <h2>Contenu des Séries !</h2>
            <table>
                    <thead>
                        <th>Titre</th>
                        <th>Genre</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${series}" var="serie">
                            <tr>
                                <td><a href="serie_detail?id=${serie.id}">${serie.titre}</a></td>
                                <td>${serie.genre.nom}</td>
                                <td><a href="supprimer_serie?id=${serie.id}">Supprimer</a></td>
                            </tr>
                        </c:forEach>
                        
                    </tbody>
            </table>
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
