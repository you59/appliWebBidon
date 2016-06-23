<%-- 
    Document   : films_liste
    Created on : 17 juin 2016, 11:13:52
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="_STYLESHEET.jsp" />
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
            <h1>Contenu de films !</h1>
            
                <table>
                    <thead>
                        <th>Titre</th>
                        <th>Année</th>
                        <th>Genre</th>
                        <th>Pays</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${films}" var="film">
                            <tr>
                                <td><a href="film_detail?id=${film.id}">${film.titre}</a></td>
                                <td>${film.annee}</td>
                                <td>${film.genre.nom}</td>
                                <td>
                                    <c:forEach items="${film.pays}" var="pays">
                                        ${pays.nom}
                                    </c:forEach>
                                </td>
                                <td><a href="supprimer_film?id=${film.id}">Supprimer</a></td>
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
