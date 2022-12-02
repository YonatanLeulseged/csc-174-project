package com.controller.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;


import com.sun.tools.javac.Main;
import org.springframework.lang.NonNull;


public class PlayerData {

    private final List<Player> items = PlayerData.returnPlayers();

    public PlayerData() throws SQLException {

    }

    public List<Player> getItems() {
        return Collections.unmodifiableList(items);
    }

    public static List<Player> returnPlayers() throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://b8e9acc0d62333:d29d99ae@us-cdbr-east-06.cleardb.net/heroku_34f03c957b2bd86?reconnect=true");
             Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM player"))
        {

            List<Player> players = new ArrayList<>();

            while (results.next()) {
                Player player = new Player();

                player.setPlayerName(results.getString(1));
                player.setLegendName(results.getString(2));

                players.add(player);;

            }

            return players;
        }


    }





    public void addPlayer(Player toAdd)
    {
        items.add(toAdd);

        System.out.println(items.size());

        // Prepared statement
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://b8e9acc0d62333:d29d99ae@us-cdbr-east-06.cleardb.net/heroku_34f03c957b2bd86?reconnect=true")) {

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO PLAYER VALUES (?,?)");
            conn.setAutoCommit(false);

            preparedStatement.setString(1, toAdd.getPlayerName());
            preparedStatement.setString(2, toAdd.getLegendName());

            preparedStatement.executeUpdate();
            conn.commit();

        } catch (SQLException e) {

            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());

            items.remove(toAdd);

        }

    }

}
