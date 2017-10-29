package com.project.HospitalProject;

import com.project.HospitalProject.config.SpringConfig;
import com.project.HospitalProject.loader.FXMLLoaderProvider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Создаем контекст спринга, для связки с FX
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        FXMLLoader loader = context.getBean(FXMLLoaderProvider.class).getContext("/main.fxml");
        Parent root = loader.load();

        //Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));

        primaryStage.setTitle("Hospital Model");
        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
