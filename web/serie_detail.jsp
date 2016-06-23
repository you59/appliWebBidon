<%-- 
    Document   : serie_detail
    Created on : 20 juin 2016, 09:58:23
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

                <h1>Détail de : ${seried.titre}</h1>

                <p>Genre : ${seried.genre.nom}</p>
                
                Réalisé par : 
                <c:forEach items="${seried.realisateurs}" var="real">
                    ${real.prenom} ${real.nom}
                </c:forEach>
                <br>
                
                Interprété par : 
                <c:forEach items="${seried.acteurs}" var="act">
                    ${act.prenom} ${reala.nom}, 
                </c:forEach>
                
                <p>Synopsis : <br>${seried.synopsis}</p>
                
                <c:forEach items="${seried.saisons}" var="saison">
                    Saison ${saison.numSaison} :
                    <c:forEach items="${saison.episodes}" var="epi">
                        <a href="episode_view?id=${epi.id}">${epi.numEpisode}</a>
                    </c:forEach>
                    <br>
                </c:forEach>
        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
