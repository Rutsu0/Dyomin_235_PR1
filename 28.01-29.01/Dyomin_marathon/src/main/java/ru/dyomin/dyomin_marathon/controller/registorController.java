package ru.dyomin.dyomin_marathon.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static ru.dyomin.dyomin_marathon.util.manager.*;

public class registorController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField regEmail;

    @FXML
    private TextField regPass;

    @FXML
    private TextField regReplayPass;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showChoiseStage(startStage,"choise-view.fxml", "Volgagrad Marathon 2025");

    }
    static String email, pas, reppas;

    @FXML
    void regButtonOnAction(ActionEvent event) {
        email = regEmail.getText();
        pas = regPass.getText();
        reppas = regReplayPass.getText();
        if (pas.equals(reppas)){
            showRegistorEventStage(startStage, "regEvent-view.fxml", "Volgagrad Marathon 2025 - Choise");
        }
    }

    @FXML
    void initialize() {
        assert regEmail != null : "fx:id=\"regEmail\" was not injected: check your FXML file 'reg-view.fxml'.";
        assert regPass != null : "fx:id=\"regPass\" was not injected: check your FXML file 'reg-view.fxml'.";
        assert regReplayPass != null : "fx:id=\"regReplayPass\" was not injected: check your FXML file 'reg-view.fxml'.";

    }

}
