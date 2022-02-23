package Controller;

import AllertMessage.Message;
import DBconnection.connection;
import com.jfoenix.controls.JFXTextArea;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ResourceBundle;

public class InsertPage implements Initializable {

    @FXML
    private JFXTextArea name;

    @FXML
    private JFXTextArea surname;

    @FXML
    private JFXTextArea birthday;

    @FXML
    private JFXTextArea city;

    @FXML
    private JFXTextArea appointement;

    @FXML
    private JFXTextArea telephone;

    connection conOBJ = new connection();
    Connection con;
    private PreparedStatement ps;
    Message msg = new Message();



    @FXML
    void addData(ActionEvent e) throws SQLException, ClassNotFoundException {
        if (name.getText().isEmpty() || surname.getText().isEmpty() || birthday.getText().isEmpty()|| city.getText().isEmpty()|| telephone.getText().isEmpty() || appointement.getText().isEmpty()) {
            msg.setMessage("Please, fill all the fields");
        }else  {


            try {
                con = conOBJ.getConnection();
                String insert = "INSERT INTO data_client(name,surname,birthday,city,telephone,appoitment)"
                        + "Values (?,?,?,?,?,?)";
                ps = con.prepareStatement(insert);
                ps.setString(1, name.getText());
                ps.setString(2, surname.getText());
                ps.setString(3, birthday.getText());
                ps.setString(4, city.getText());
                ps.setString(5, telephone.getText());
                ps.setString(6, appointement.getText());
                ps.executeUpdate();
                msg.setMessage("Data inserted");


            } catch (RuntimeException | MysqlDataTruncation exception) {
                msg.setMessage("Data must contain maximum 20 character");
            }
        }

    }


    @Override
    public void initialize(URL arg0, ResourceBundle resourceBundle) {
        name.setStyle("-fx-text-inner-color:#afbccd;");
        surname.setStyle("-fx-text-inner-color:#afbccd;");
        birthday.setStyle("-fx-text-inner-color:#afbccd;");
        city.setStyle("-fx-text-inner-color:#afbccd;");
        appointement.setStyle("-fx-text-inner-color:#afbccd;");
        telephone.setStyle("-fx-text-inner-color:#afbccd;");
    }


}






