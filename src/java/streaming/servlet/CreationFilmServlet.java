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
import steaming.service.FilmService;
import steaming.service.GenreService;
import steaming.service.PaysService;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;


/**
 *
 * @author admin
 */
@WebServlet(name = "CreationFilm", urlPatterns = {"/creation_film"})
public class CreationFilmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        FilmService service = new FilmService();
        Film f = new Film();
        Genre g = em.find(Genre.class, Long.parseLong(req.getParameter("genre")));
        
        f.setTitre(req.getParameter("titre"));
        f.setAnnee(Integer.parseInt( req.getParameter("anneeProd")));
        f.setDuree(Integer.parseInt( req.getParameter("duree")));
        f.setGenre(g);
        g.getFilms().add(f);
        f.setSynopsis(req.getParameter("synopsis"));
        
        service.ajouter(f);
        
        resp.sendRedirect("films_liste");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        GenreService service = new GenreService();
        List<Genre> g = service.listG();
        
        req.setAttribute("genres", g);
        
        PaysService servicep = new PaysService();
        List<Pays> p = servicep.listP();
        
        req.setAttribute("pays", p);
        
        req.getRequestDispatcher("creation_film.jsp").forward(req, resp);
    }
}
