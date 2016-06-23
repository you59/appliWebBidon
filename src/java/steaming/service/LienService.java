/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienService {
    
    public void supprimerLien(long id) {
        
        new LienDAO().supprimerLien(id);
    }
    
    public void modifierLien(Lien lien) {
        
        new LienDAO().modifierLien(lien);
    }
    
    public Lien rechercherLienId(long lienId) {
        
        LienDAO dao = new LienDAO();
        
        return dao.rechercherLienId(lienId);
    }
    
    public List<Lien> listerLien() {
        
        LienDAO dao = new LienDAO();
        
        return dao.listerTous();
    }
    
    public void ajoutLien(Lien l) {
        
        new LienDAO().ajouterLien(l);
    }
}
