package edu.usmp.myapp.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.usmp.myapp.integration.sendgrid.SendGridAPI;
import edu.usmp.myapp.integration.spotity.SpotifyAPI;


@Controller
public class HomeController {

   private static final String HOME_INDEX = "welcome";

   private final SpotifyAPI spotifyAPI;
   private final SendGridAPI sendGridAPI;

   public HomeController(SpotifyAPI spotifyAPI,SendGridAPI sendGridAPI ){
       this.spotifyAPI = spotifyAPI;
       this.sendGridAPI = sendGridAPI;
   }


    @GetMapping("/")
    public String index(Model model){
        spotifyAPI.me();
        sendGridAPI.send("edwin_ramos2@usmp.pe","edwinmrc.12@gmail.com","test","test");

        return HOME_INDEX;
    }



}
