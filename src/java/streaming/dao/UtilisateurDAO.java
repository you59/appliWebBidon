/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {
    
    public Utilisateur verifConnec(String idtf, String pwd) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.pass=:monMdp");
        query.setParameter("monLogin", idtf);
        query.setParameter("monMdp", pwd);
        
        return (Utilisateur) query.getSingleResult();
    }
    
    public List<Utilisateur> rechercheParLogin(String login) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login").setParameter("login", login).getResultList();
    }

    public List<Utilisateur> rechercheParEmail(String email) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:email").setParameter("email", email).getResultList();
    }
    
    public void ajouter(Utilisateur util) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(util);
        
        em.getTransaction().commit();
    }
    
    public Utilisateur verifEtatUtil(String login, String pass) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login AND u.pass=:mdp");
        query.setParameter("login", login);
        query.setParameter("mdp", pass);
        
        return (Utilisateur) query.getSingleResult();
    }
}
