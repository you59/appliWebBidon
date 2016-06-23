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
import steaming.service.UtilisateurService;
import streaming.entity.Utilisateur;
import streaming.entity.Utilisateur.EtatUtil;

/**
 *
 * @author admin
 */
@WebServlet(name = "UtilisateurServlet", urlPatterns = {"/home"})
public class UtilisateurServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        UtilisateurService service = new UtilisateurService();
        Utilisateur u = new Utilisateur();
        
        String identifiant = req.getParameter("idtf");
        String pass = req.getParameter("pwd");
        
        u = service.verifEtat(identifiant, pass);
        
        if (u.getEtatUtil().equals(EtatUtil.VALIDE)) {
            
            u = service.verifConnection(identifiant, pass);
            
            // Je suis loggé correctement
            resp.addCookie(new Cookie("login", identifiant));
            resp.addCookie(new Cookie("mdp", pass));
            resp.addCookie(new Cookie("userRight", u.getUserRight().toString()));
            
            resp.sendRedirect("films_liste");

            return;
            
        } else if (u.getEtatUtil().equals(EtatUtil.NON_VALIDE)) {
            
            System.out.println("Vous devez d'abord valider votre inscription par mail !");
            
            resp.sendRedirect("home");
            
            return;
            
        }
    }
}
