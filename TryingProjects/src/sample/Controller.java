package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;


public class Controller {
    Connection con;
    connection conOBJ = new connection();


    @FXML
    private TextField text;

    @FXML
    private Button button;

    @FXML
    void onClick(ActionEvent event) throws SQLException, ClassNotFoundException {



        conOBJ.getConnection();

    }




}











