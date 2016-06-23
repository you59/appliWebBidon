<%-- 
    Document   : home
    Created on : 16 juin 2016, 17:01:57
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
           
            <h1>Connection au Monde des Poney !</h1>
            
            <form method="POST">
                
                <h4>Identifiant</h4>
                <input type="text" name="idtf">
                <br>
                <h4>Mot de Passe</h4>
                <input type="password" name="pwd">
                <br>
                <br>
                <input type="submit" value="Valider">
                
                <p>Pas de compte ? <a href="inscription">Inscription</a></p>
                
            </form>

        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
            
    </body>
</html>
