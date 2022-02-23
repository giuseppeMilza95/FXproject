
package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class DatabaseConnection {
    Connection con;
    public Connection  getConnection() throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WSB", "root", "password1");

            } catch (SQLException e){
            System.out.println(e.getMessage());

        }
        return con;
    }
}
