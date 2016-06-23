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
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {
    
    public List<Serie> listerTous() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }
    
    public void createSerie(Serie s) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(s);
        
        em.getTransaction().commit();
    }
    
    public void supprimerSerie(long serieId) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        Query q = em.createQuery("DELETE FROM Serie s WHERE s.id=:idSerie");
        q.setParameter("idSerie", serieId);
        q.executeUpdate();
        
        em.getTransaction().commit();
    }
    
    public void modifierSerie(Serie serie) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.merge(serie);
        
        em.getTransaction().commit();
    }
}
