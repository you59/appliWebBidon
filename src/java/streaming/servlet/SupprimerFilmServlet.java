/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import steaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "SupprimerFilmServlet", urlPatterns = {"/supprimer_film"})
public class SupprimerFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        long filmId = Long.parseLong(req.getParameter("id"));
        new FilmService().supprimerFilm(filmId);
        
        resp.sendRedirect("films_liste");
    }
}
