/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.dao.GenreDAO;
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {
    
    public List<Genre> listG() {
        
        GenreDAO dao = new GenreDAO();
        
        return dao.listerGenre();
    }
    
    public Genre rechercherParId(long genreId) {
        
        return new GenreDAO().rechercherParId(genreId);
    }
    
    public void supprimerGenre(long id) {
        
        new GenreDAO().supprimerGenre(id);
    }
    
    public void modifierGenre(Genre genre) {
        
        new GenreDAO().modifierGenre(genre);
    }
    
    public void ajoutGenre(Genre g) {
        
        new GenreDAO().ajouterGenre(g);
    }
}
