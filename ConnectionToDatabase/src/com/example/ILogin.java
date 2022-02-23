package com.example;

import java.sql.SQLException;

public interface ILogin {

    boolean login(String login, String password) throws SQLException;

    boolean insertData(String fullName, String password,String email);
}
