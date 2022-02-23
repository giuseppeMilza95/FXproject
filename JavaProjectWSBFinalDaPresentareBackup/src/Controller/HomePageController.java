package Controller;

import DBconnection.connection;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import AllertMessage.Message;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class HomePageController extends goLogin implements Initializable {

    @FXML
    private JFXButton insert;


    @FXML
    private TableView<Student> table;


    @FXML
    private TableColumn<Student, String> name;

    @FXML
    private TableColumn<Student, String> surname; // student class and value as a string

    @FXML
    private TableColumn<Student, String> birthday;

    @FXML
    private TableColumn<Student, String> city;

    @FXML
    private TableColumn<Student, String> telephone;

    @FXML
    private TableColumn<Student, String> appointment;

    @FXML
    private JFXButton logout;

    Connection con;
    PreparedStatement pst;
    connection conOBJ = new connection(); //create an Object of class connection
    Message msg = new Message();// create an object of class Message


    void refresh() throws SQLException, ClassNotFoundException {
        con = conOBJ.getConnection();
        ObservableList<Student> data = FXCollections.observableArrayList(); // add the value into the table
        table.setItems(data); // set data in the table
        String str = " Select *from data_client ";
        pst = con.prepareStatement(str); // prepared statement i used to execute query or update
        ResultSet rs = pst.executeQuery();
        while (rs.next()) { // i used while loop to retrieve the data
            Student s = new Student(rs.getString("name"), rs.getString("surname"), rs.getString("birthday"), rs.getString("city"), rs.getString("telephone"), rs.getString("appoitment"), rs.getString("ID"));
            data.add(s); // add data in the ObservableList


        }


    }


    @FXML
    void showData(ActionEvent event) throws SQLException, ClassNotFoundException {
        refresh();

    }

    @FXML
    void deleteData(ActionEvent event) throws SQLException, ClassNotFoundException {
        try {
            con = conOBJ.getConnection();
            pst = con.prepareStatement("DELETE FROM data_client WHERE ID = ?");
            Student studentData = table.getSelectionModel().getSelectedItem();
            pst.setString(1, studentData.getID());
            pst.execute();
            refresh();
            msg.setMessage("Data Deleted");


        } catch (RuntimeException e) {
            msg.setMessage("Table Empty or data not selected");

        }
    }


    @FXML
    void insertData(ActionEvent event) throws IOException {

        insert.getScene().getWindow();
        Stage ins = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/InsertPage.fxml"));
        Scene scene = new Scene(root);
        ins.setScene(scene);
        ins.show();


    }


    @FXML
    void buttonLogout(ActionEvent event) throws IOException {
        logout.getScene().getWindow().hide();
        goToLogin();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<>("Name")); // to view simple string property add(pass database object)
        surname.setCellValueFactory(new PropertyValueFactory<>("Surname"));
        birthday.setCellValueFactory(new PropertyValueFactory<>("Birthday"));
        telephone.setCellValueFactory(new PropertyValueFactory<>("Telephone"));
        appointment.setCellValueFactory(new PropertyValueFactory<>("Appointment"));
        city.setCellValueFactory(new PropertyValueFactory<>("City"));

    }


}


