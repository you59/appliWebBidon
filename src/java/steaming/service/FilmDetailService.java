/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.FilmDetailDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDetailService {
    
    public Film lister(long id) {
        
        FilmDetailDAO dao = new FilmDetailDAO();
        
        return dao.listeDetailFilmId(id);
    }
}
