/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class FilmService {
    
    public List<Film> lister() {
        
        FilmDAO dao = new FilmDAO();
        
        return dao.listerTous();
    }
    
    public void ajouter(Film f) {
        
        FilmDAO dao = new FilmDAO();
        
        dao.createFilm(f);
    }
    
    public void supprimerFilm(long filmId) {
        
        FilmDAO dao = new FilmDAO();
        
        dao.supprimerFilm(filmId);
    }
    
    public void modifierFilm(Film film) {
        
        new FilmDAO().modifier(film);
    }
}
