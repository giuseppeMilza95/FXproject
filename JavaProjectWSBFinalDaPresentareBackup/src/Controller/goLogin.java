package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class goLogin {

    void goToLogin() throws IOException {

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
    }

}
