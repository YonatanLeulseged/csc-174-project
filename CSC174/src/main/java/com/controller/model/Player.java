package com.controller.model;

// Create an object for the Players that will be added
public class Player {

    // Create two private variables to capture the data that is going to be entered by the user
    String playerName;
    String legendName;


    // Create a constructor and set the private fields to the fields that are being passed to it
    public Player(String playerName, String legendName) {
        this.playerName = playerName;
        this.legendName = legendName;
    }

    public Player(){

    }


    // Getter method for the playerName field
    public String getPlayerName() {
        return playerName;
    }

    // Setter method for the playerName field
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter method for the legendName field
    public String getLegendName() {
        return legendName;
    }

    // Setter method for the legendName field
    public void setLegendName(String legendName) {
        this.legendName = legendName;
    }
}