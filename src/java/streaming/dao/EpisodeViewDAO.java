/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class EpisodeViewDAO {
    
    public Episode lireEpisodeId(long id) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return (Episode) em.createQuery("SELECT e FROM Episode e WHERE e.id=" + id).getSingleResult();
    }
}
