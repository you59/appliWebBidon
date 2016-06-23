<%-- 
    Document   : film_detail
    Created on : 17 juin 2016, 15:06:28
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

                <h1>Détail de : ${details.titre}</h1>

                <p>Année de Production : ${details.annee}</p>
                <p>Durée : ${details.duree}</p>
                <p>Genre : ${details.genre.nom}</p>
                
                Pays de Production : 
                <c:forEach items="${details.pays}" var="pay">
                    ${pay.nom}
                </c:forEach>
                <br>
                
                Réalisé par : 
                <c:forEach items="${details.realisateurs}" var="real">
                    ${real.prenom} ${real.nom}
                </c:forEach>
                <br>
                
                    Interprété par : 
                <c:forEach items="${details.acteurs}" var="reala">
                    ${reala.prenom} ${reala.nom}, 
                </c:forEach>
                
                <p>Synopsis : <br>${details.synopsis}</p>
                
                Liens :
                <c:forEach items="${details.liens}" var="lien">
                    ${lien.langue} ${epis.qualite} <a href="${epis.url}">Voir en Streaming</a>
                </c:forEach>

        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
