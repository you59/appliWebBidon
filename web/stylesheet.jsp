<%-- 
    Document   : stylesheet
    Created on : 22 juin 2016, 16:16:22
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
           
            <h1>Changez le Style du site !</h1>
            
            <form method="POST" action="stylesheet">
                
                <select name="stylesheet">
                    <option value="pony" >My Little Pony</option>
                    <option value="drag" >Dragon</option>
                </select>
                
                <input type="submit" value="Valider">
                
            </form>
            
        </div>
            
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
