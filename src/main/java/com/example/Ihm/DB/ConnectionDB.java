package com.example.Ihm.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection connect() throws SQLException {
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ihmvente?serverTimezone=Africa/Nairobi", "root","root");
        return connection;
    }
    public String connectU() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ihmvente?serverTimezone=Africa/Nairobi", "root", "root");
            return "Connecté à la base de données";
        } catch (SQLException e) {
            throw new SQLException("Échec de la connexion à la base de données : " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

}
