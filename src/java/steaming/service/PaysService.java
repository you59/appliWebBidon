/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import java.util.List;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysService {
    
    public List<Pays> listP() {
        
        PaysDAO dao = new PaysDAO();
        
        return dao.listerPays();
    }
}
