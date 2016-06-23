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
import steaming.service.FilmDetailService;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "FilmDetailServlet", urlPatterns = {"/film_detail"})
public class FilmDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        long film_id = Long.parseLong( req.getParameter("id") );
        
        Film f = new FilmDetailService().lister(film_id);
        
        req.setAttribute("details", f);
        
        req.getRequestDispatcher("film_detail.jsp").forward(req, resp);
    }
}
