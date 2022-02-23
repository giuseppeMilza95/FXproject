package com.example;

import java.sql.*;
import java.util.Scanner;


public class Login implements ILogin{

    private DatabaseConnection connection;
    private Statement statement;
    private PreparedStatement ps;
    public Login() throws SQLException {
        this.connection = new DatabaseConnection();
        this.statement = connection.getConnection().createStatement();


    }


    @Override
    public boolean login(String email, String password) throws SQLException {
        try {
            String loginQuery = "SELECT * FROM student where email=? and password=?";
            ps = connection.getConnection().prepareStatement(loginQuery);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet resultSet = ps.executeQuery();
            int count = 0;

            while (resultSet.next()) {
                count = count + 1;
            }

                if (count ==1) {
                        
                        System.out.println("Access Granted");
                        return true;


                }else{
                    System.out.println("Wrong credential");
                    return false;
                }


        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    @Override
    public boolean insertData(String fullName, String password, String email) {
            try {
                String insert = "INSERT INTO student(fullName, password, email) VALUES(?,?,?)";
                ps = connection.getConnection().prepareStatement(insert);
                ps.setString(1,fullName);
                ps.setString(2,password);
                ps.setString(3,email);
                ps.executeUpdate();
                System.out.println("CIAO");

                return true;

            }catch(SQLException e){
                System.out.println(e);
            }
            return false;
    }
}
