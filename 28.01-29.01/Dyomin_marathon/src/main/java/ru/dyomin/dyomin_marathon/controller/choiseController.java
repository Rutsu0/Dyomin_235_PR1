package ru.dyomin.dyomin_marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.dyomin.dyomin_marathon.util.manager.*;

public class choiseController implements Initializable {

    @FXML
    private Button backButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button registorButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showStartStage(startStage,"start-view.fxml", "Volgagrad Marathon 2025");

    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showLoginStage("login-view.fxml", "Volgagrad Marathon 2025 - Login");

    }

    @FXML
    void registorButtonOnAction(ActionEvent event) {
        showRegistorStage("reg-view.fxml", "Volgagrad Marathon 2025 - Registor");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
