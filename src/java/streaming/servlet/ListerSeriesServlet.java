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
import steaming.service.SerieService;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerSeriesServlet", urlPatterns = {"/series_liste"})
public class ListerSeriesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        SerieService service = new SerieService();
        List<Serie> seriesFound = service.lister();
        
        req.setAttribute("series", seriesFound);
        
        req.getRequestDispatcher("series_liste.jsp").forward(req, resp);
    }
}
