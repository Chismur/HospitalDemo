package com.project.HospitalProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //Stage window;
    //Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
       // window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        primaryStage.setTitle("Hospital Model");
        Scene scene = new Scene(root,700,400);
        //scene.getStylesheets().add(getClass().getResource("/styles/my.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

       // window = primaryStage;


    }

    public static void main(String[] args) {

        launch(args);
    }
}
