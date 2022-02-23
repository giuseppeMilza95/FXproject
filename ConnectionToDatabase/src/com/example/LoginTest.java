package com.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class LoginTest {






    @Test
    public void login() throws SQLException {
        Login login = new Login();
        assertTrue(login.login("giuseppe_1995@live.it","password"));
    }

    @Test
    public void insertData() {
        fail();
    }
}