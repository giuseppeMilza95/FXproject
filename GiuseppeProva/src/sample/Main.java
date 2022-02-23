package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    @Override
    public void init() throws Exception {
        try {
            TodoData.getInstance().loadTodoData();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void stop() throws Exception {
        try {
            TodoData.getInstance().writeTodoData();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);


    }
}



