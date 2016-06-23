<%-- 
    Document   : episode_view
    Created on : 20 juin 2016, 11:23:34
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

            <h1>Episode : ${episo.numEpisode} de la saison ${episo.saison.numSaison} de la Série : ${episo.saison.serie.titre}</h1>
                
        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
                    
    </body>
</html>
