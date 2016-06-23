/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysDAO {
    
    public List<Pays> listerPays() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT p FROM Pays p").getResultList();
    }
}
