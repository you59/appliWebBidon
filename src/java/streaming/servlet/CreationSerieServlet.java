/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import steaming.service.GenreService;
import steaming.service.SerieService;
import streaming.entity.Genre;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@WebServlet(name = "CreationSerieServlet", urlPatterns = {"/creation_serie"})
public class CreationSerieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        SerieService service = new SerieService();
        Serie s = new Serie();
        
        long genreId = Long.parseLong(req.getParameter("genre"));
        Genre genre = new GenreService().rechercherParId(genreId);
        
        s.setTitre(req.getParameter("titre"));
        s.setGenre(genre);
        genre.getSeries().add(s);
        s.setSynopsis(req.getParameter("synopsis"));
        
        service.ajouter(s);
        
        resp.sendRedirect("series_liste");
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        GenreService service = new GenreService();
        
        List<Genre> g = service.listG();
        
        req.setAttribute("genres", g);
        
        req.getRequestDispatcher("creation_serie.jsp").forward(req, resp);
    }
}
