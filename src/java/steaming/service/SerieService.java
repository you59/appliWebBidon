/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    
    public List<Serie> lister() {
        
        SerieDAO dao = new SerieDAO();
        
        return dao.listerTous();
    }
    
    public void ajouter(Serie s) {
     
        SerieDAO dao = new SerieDAO();
        
        dao.createSerie(s);
    }
    
    public void supprimerSerie(long serieId) {
        
        SerieDAO dao = new SerieDAO();
        
        dao.supprimerSerie(serieId);
    }
    
    public void modifierSerie(Serie serie) {
        
        new SerieDAO().modifierSerie(serie);
    }
}
