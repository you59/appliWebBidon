<%-- 
    Document   : creation_film
    Created on : 17 juin 2016, 09:35:38
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
            <form class="create_movie" method="post" action="">
            
                <h1>Crée un Film !</h1>
                Titre <br />
                <input type="text" name="titre"><br />
                Année Production<br />
                <input type="date" name="anneeProd"><br />

                Genre <br />
                <select name="genre">
                    <c:forEach items="${genres}" var="genre">
                        <option value="${genre.id}">${genre.nom}</option>
                    </c:forEach>
                </select><br />

                Durée<br>
                <input type="time" name="duree"><br />

                Synopsis : <br>
                <textarea name="synopsis" rows="5"></textarea><br><br>

                <input type="submit" value="Valider">

            </form>
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
        
    </body>
</html>
