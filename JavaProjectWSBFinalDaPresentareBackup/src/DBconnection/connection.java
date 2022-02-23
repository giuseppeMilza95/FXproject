package DBconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection extends Configs{ // extend the Configs Class
    Connection con; // Connection object

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        //Class.forName("com.mysql.jdbc.Driver"); // register sql driver, we pass a string to register our mysql driver
        String str = "jdbc:mysql://"+ Configs.dbhost+":"+ Configs.dbport+ "/"+Configs.dbname;
        con = DriverManager.getConnection(str,Configs.dbuser,Configs.dbpassword ); // Connect to my database
        return con;
    }
}
