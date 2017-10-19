package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class Main extends Application {

    Stage window;
    Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hospital Model");
        Scene scene = new Scene(root,300,400);
        //scene.getStylesheets().add(getClass().getResource("/styles/my.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

        window = primaryStage;


    }

    public static void main(String[] args) {



        launch(args);
    }
}
