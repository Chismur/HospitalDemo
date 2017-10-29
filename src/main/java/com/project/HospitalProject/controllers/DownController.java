package com.project.HospitalProject.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;


public class DownController {
    private MainController mainController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    void showAll(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    @Autowired
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}

