package com.controller.service;

import com.controller.model.Player;
import com.controller.model.PlayerData;
import org.springframework.stereotype.Service;

import java.sql.SQLException;


// Create the Object PlayerServiceImpl
@Service
public class PlayerServiceImpl implements PlayerService {

    // Create a public final variable playerdata to keep track of the PlayerData that is being inserted
    public final PlayerData playerdata = new PlayerData();


    // Empty Constructor
    public PlayerServiceImpl() throws SQLException {

    }


    // Override the initial initialization for addPlayer and have the method add the player to playerdata
    @Override
    public void addPlayer(Player toAdd)
    {
        playerdata.addPlayer(toAdd);
    }


    // Override the initial initialization for getPlayerData and have the method return the playerdata
    @Override
    public PlayerData getPlayerData()
    {
        return playerdata;
    }

}
