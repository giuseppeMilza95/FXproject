package sample;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class connection extends Configs {
    String url = "jdbc:mysql://localhost:3306/javabase";
    String username = "java";
    String password = "password";

    void getConnection() {
    System.out.println("Connecting database...");

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Database connected!");
    } catch (SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }

}
}




