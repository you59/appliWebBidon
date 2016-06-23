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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "ChangerStyleSiteServlet", urlPatterns = {"/stylesheet"})
public class ChangerStyleSiteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String styleSite = req.getParameter("stylesheet");
        
        resp.addCookie(new Cookie("choixStyle", styleSite));
        
        resp.sendRedirect("stylesheet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String styleSite = req.getParameter("stylesheet");
        //System.out.println("le style" + styleSite);
        
        resp.addCookie(new Cookie("choixStyle", styleSite));
        
        req.getRequestDispatcher("stylesheet.jsp").forward(req, resp);
    }
}
