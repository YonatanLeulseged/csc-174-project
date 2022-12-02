package com.controller.service;
import com.controller.model.Player;
import com.controller.model.PlayerData;

// Create an interface called PlayerService
public interface PlayerService {

    // Initialize the addPlayer method so we can add players
    void addPlayer(Player toAdd);

    // Initialize the PlayerData method so we can get player data
    public PlayerData getPlayerData();

}
