/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steaming.service;

import streaming.dao.EpisodeViewDAO;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class EpisodeViewService {
    
    public Episode EpisodeView(long id) {
        
        EpisodeViewDAO dao = new EpisodeViewDAO();
        
        return dao.lireEpisodeId(id);
    }
}
