<%-- 
    Document   : inscription
    Created on : 22 juin 2016, 11:03:58
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
           
            <h1>Inscription Chez les Poney !</h1>
            
            <form method="POST">
                
                Login
                <input type="text" name="login">
                <br>
                        
                Email
                <input type="text" name="email">
                <br>
                    
                Mot de Passe
                <input type="password" name="pwd">
                <br>
                        
                Retapez le mot de Passe
                <input type="password" name="pwd_deux">
                <br>
                        
                <input type="submit" value="Valider">
                <br>
                <br>
                
            </form>
            
        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
