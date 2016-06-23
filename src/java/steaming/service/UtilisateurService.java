/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    public void inscription(Utilisateur util) {

        UtilisateurDAO dao = new UtilisateurDAO();
        
        // Throw exception si login existe
        
        List<Utilisateur> listeUtilAvecCeLogin = dao.rechercheParLogin(util.getLogin());
                
        if ( listeUtilAvecCeLogin.size() > 0 ) {
            
            throw new RuntimeException("ce login existe deja");
        }
        
        
        List<Utilisateur> listeUtilAvecCeMail = dao.rechercheParEmail(util.getEmail());
                
        if ( listeUtilAvecCeMail.size() > 0 ) {
            
            throw new RuntimeException("ce mail existe deja");
        }
        
        // Passe l'util à l'état NON_VALIDE
        util.setEtatUtil(Utilisateur.EtatUtil.NON_VALIDE);
        util.setUserRight(Utilisateur.UserRight.NORMAL);
        
        // Persiste
        dao.ajouter(util);
        
        // Envoie mail de validation
        new MailService().envoyerMail(util.getEmail(), "Inscription réussie", "Veuillez valider");
        
    }
    
    public Utilisateur verifConnection(String idtf, String pwd) {
        
        UtilisateurDAO dao = new UtilisateurDAO();
        
        return dao.verifConnec(idtf, pwd);
    }
    
    public Utilisateur verifEtat(String login, String pass) {
        
        UtilisateurDAO dao = new UtilisateurDAO();
        
        return dao.verifEtatUtil(login, pass);
    }
}
