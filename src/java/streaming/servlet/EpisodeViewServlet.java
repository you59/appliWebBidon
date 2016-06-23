/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import steaming.service.EpisodeViewService;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
@WebServlet(name = "EpisodeViewServlet", urlPatterns = {"/episode_view"})
public class EpisodeViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        long episode_id = Long.parseLong( req.getParameter("id") );
        
        Episode e = new EpisodeViewService().EpisodeView(episode_id);
        
        req.setAttribute("episo", e);
        
        req.getRequestDispatcher("episode_view.jsp").forward(req, resp);
    }
}
