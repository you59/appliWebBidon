/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDetailDAO {
    
    public Serie listerSerieDetail(long id) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return (Serie) em.createQuery("SELECT s FROM Serie s WHERE s.id=" + id).getSingleResult();
    }
}
