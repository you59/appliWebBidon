/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDetailDAO {
    
    public Film listeDetailFilmId(long id) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return (Film) em.createQuery("SELECT f FROM Film f WHERE f.id=" + id).getSingleResult();
    }
}