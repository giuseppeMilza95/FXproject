package Controller;

import AllertMessage.Message;
import DBconnection.connection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class SignUpController extends goLogin implements Initializable{

    @FXML
    private JFXTextField fullname;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXCheckBox check;

    @FXML
    private JFXButton signup;

    @FXML
    private JFXButton login;
    private PreparedStatement ps;

    connection conOBJ = new connection();
    Connection con;
    Message msg = new Message();


    @FXML
    void goLogin(ActionEvent event) throws IOException {
        login.getScene().getWindow().hide(); // hide the sign up screen
        goToLogin(); // call the login method to back to my login page


    }

    @FXML
    void signUp(ActionEvent event) throws SQLException, ClassNotFoundException {
        try {
            if (fullname.getText().isEmpty() || password.getText().isEmpty() || email.getText().isEmpty()) {
                msg.setMessage("Please, fill all the fields");
            } else if (check.isSelected()) {


                con = conOBJ.getConnection();
                String insert = "INSERT INTO student(fullName,password,email)"
                        + "Values (?,?,?)";
                ps = con.prepareStatement(insert);
                ps.setString(1, fullname.getText());
                ps.setString(2, password.getText());
                ps.setString(3, email.getText());
                ps.executeUpdate();
                msg.setMessage("Your Account has been successfully created");
            } else {
                msg.setMessage("Agree terms and condition");
            }


        } catch (RuntimeException | SQLIntegrityConstraintViolationException exception) {
            msg.setMessage("This email address is already being used");

        }

    }


    @Override
    public void initialize(URL arg0, ResourceBundle resourceBundle) {
        fullname.setStyle("-fx-text-inner-color:#afbccd;"); // java fx css style
        email.setStyle("-fx-text-inner-color:#afbccd;");
        password.setStyle("-fx-text-inner-color:#afbccd;");
    }
}
