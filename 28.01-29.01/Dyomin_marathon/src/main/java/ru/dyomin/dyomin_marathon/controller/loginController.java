package ru.dyomin.dyomin_marathon.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.dyomin.dyomin_marathon.controller.registorController.pas;
import static ru.dyomin.dyomin_marathon.util.manager.*;
import static ru.dyomin.dyomin_marathon.util.manager.startStage;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputPasword;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showChoiseStage(startStage,"choise-view.fxml", "Volgagrad Marathon 2025");

    }

    @FXML
    void saveLoginButtonOnAction(ActionEvent event) {
        String Email = inputEmail.getText();
        String Pas = inputPasword.getText();
        if (registorController.email.equals(Email) && Pas.equals(pas)); {
            showRegistorEventStage(startStage, "regEvent-view.fxml", "Volgagrad Marathon 2025");
        }
    }

    @FXML
    void initialize() {
        assert inputEmail != null : "fx:id=\"inputEmail\" was not injected: check your FXML file 'login-view.fxml'.";
        assert inputPasword != null : "fx:id=\"inputPasword\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}
