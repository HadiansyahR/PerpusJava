package org.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dreamvalian
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionManager {
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String HOST = "localhost";
    private String database;

    public ConnectionManager(String database) {
        this.database = database;
    }

    public Connection logOn() throws SQLException {
        Connection db = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + database, USER, PASSWORD);
        return db;
    }
}

