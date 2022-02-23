package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import DBconnection.connection;
import javafx.stage.Stage;
import AllertMessage.Message;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton register;

    @FXML
    private JFXButton login;
    Connection con;
    connection conClass = new connection();
    private PreparedStatement pst;
    Message msg = new Message();

    @FXML
    void createLogin(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        con = conClass.getConnection();
        String str = "SELECT *FROM STUDENT where email=? and password=?";
        pst = con.prepareStatement(str);
        pst.setString(1, username.getText());
        pst.setString(2, password.getText());
        ResultSet rs = pst.executeQuery();
        int count = 0;
        while (rs.next()) {
            count = count + 1;

        }
        if (count == 1) {


            login.getScene().getWindow().hide();
            Stage home = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/HomePage.fxml"));
            Scene scene = new Scene(root);
            home.setScene(scene);
            home.show();

        } else {
            msg.setMessage("Login failed");
        }

    }

    @FXML
    void createRegister(ActionEvent event) throws IOException {

        register.getScene().getWindow().hide(); // hide screen login
        Stage signup = new Stage(); // create the stage
        Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/SignUp.fxml")); //load the fxml file
        Scene scene = new Scene(root); // create the scene
        signup.setScene(scene); // set the scene in our stage
        signup.show(); // show the stage
    }

}
