package com.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException , ClassNotFoundException, IOException {
	Car bmw = new Car("BMW");
	bmw.model = "Serie 1";
        Connection connection;
	ConnectionDataBase connectionDatabBase = new ConnectionDataBase();
	connection = connectionDatabBase.getConnection();

	if (connection != null){
        System.out.println("connected");

    } else{
        System.out.println("not connected");
    }



    }
}
