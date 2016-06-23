/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import steaming.service.FilmService;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/films_liste"})
public class ListerFilmsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        FilmService service = new FilmService();
        List<Film> filmsFound = service.lister();
        
        req.setAttribute("films", filmsFound);
        
        req.getRequestDispatcher("films_liste.jsp").forward(req, resp);
        
    }
}
