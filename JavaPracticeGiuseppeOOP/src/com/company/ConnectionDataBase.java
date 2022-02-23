package com.company;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDataBase {
    protected static final String DB_HOST = "localhost";
    protected static final String DB_PORT = "3306";
    protected static final String DB_USER = "root";
    protected static final String DB_PASSWORD = "Hotbuttered95";
    protected static final String DB_NAME = "WSB";

    private Connection connection;


    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
        connection = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
        return connection;
    }


}
