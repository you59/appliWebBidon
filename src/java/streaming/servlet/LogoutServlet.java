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
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie c;
        
        // supprime nos 3 cookies
        c = new Cookie("login", null);
        c.setMaxAge(0);
        resp.addCookie(c);
        
        c = new Cookie("mdp", null);
        c.setMaxAge(0);
        resp.addCookie(c);
        
        c = new Cookie("userRight", null);
        c.setMaxAge(0);
        resp.addCookie(c);
        
        resp.sendRedirect("home");
    }
}
