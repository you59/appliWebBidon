/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import steaming.service.UtilisateurService;
import streaming.entity.Utilisateur;
import streaming.entity.Utilisateur.UserRight;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionUtilServlet", urlPatterns = {"/inscription"})
public class InscriptionUtilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        UtilisateurService service = new UtilisateurService();
        Utilisateur util = new Utilisateur();
        
        util.setLogin(req.getParameter("login"));
        util.setEmail(req.getParameter("email"));
        
        String password = req.getParameter("pwd");
        String passwordtwo = req.getParameter("pwd_deux");
        
        if (!password.equals(passwordtwo)) {
            System.out.println("Les mots de passe ne sont pas identique");
        } else if (password.equals(passwordtwo)) {
            util.setPass(password);
        }
        
        String statut = req.getParameter("admin");
        
        if (statut.equals("ADMIN")) {
            util.setUserRight(UserRight.ADMIN);
        } else if (statut.equals("NORMAL")) {
            util.setUserRight(UserRight.NORMAL);
        }
        
        service.inscription(util);
        
        resp.sendRedirect("home");
    }
}
