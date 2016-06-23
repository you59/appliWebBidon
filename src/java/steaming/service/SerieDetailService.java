/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import streaming.dao.SerieDetailDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDetailService {
    
    public Serie lister(long id) {
        
        SerieDetailDAO dao = new SerieDetailDAO();
        
        return dao.listerSerieDetail(id);
    }
}
