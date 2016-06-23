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
import steaming.service.SerieDetailService;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@WebServlet(name = "SerieDetailServlet", urlPatterns = {"/serie_detail"})
public class SerieDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        long serie_id = Long.parseLong( req.getParameter("id"));
        
        Serie s = new SerieDetailService().lister(serie_id);
        
        req.setAttribute("seried", s);
        
        req.getRequestDispatcher("serie_detail.jsp").forward(req, resp);
    }
}
