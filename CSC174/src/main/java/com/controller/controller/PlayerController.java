package com.controller.controller;

// Import all the needed packages
import com.controller.model.Player;
import com.controller.model.PlayerData;
import com.controller.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

// Create a controller class name PlayerController
@Controller
public class PlayerController {

    // Create a new private final variable called player_service using the PlayerService Interface
    private final PlayerService player_service;


    // Create a constructor to set the private final variable player_service to the playerService being passed
    @Autowired
    public PlayerController(PlayerService playerService)
    {
        this.player_service = playerService;
    } // Close of Player Controller


    // Create the PlayerData model attribute
    @ModelAttribute
    public PlayerData playerData(){
        return player_service.getPlayerData();
    } // Close of PlayerData


    // Create the addPlayerGet getMapping
    @GetMapping("/addPlayer")
    public String addPlayerGet(Model model)
    {

        // When we get to the /addPlayer set the fields to blanks
        Player player = new Player("", "");

        // Set the model of the display to player
        model.addAttribute("player", player);

        // Return
        return "addPlayer";

    } // Close of addPlayerGet


    // Create the addPlayerPost PostMapping
    @PostMapping("/addPlayer")
    public String addPlayerPost(@ModelAttribute("player") Player player)
    {

        // Add the player to player_service
        player_service.addPlayer(player);

        // Redirect the page back to /addPlayer so they can add more players and view the Player table
        return "redirect:/addPlayer";

    } // Close of addPlayerPost

} // Close of PlayerController
