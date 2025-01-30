package ru.dyomin.dyomin_marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.dyomin.dyomin_marathon.util.manager.showChoiseStage;
import static ru.dyomin.dyomin_marathon.util.manager.startStage;

public class startController  implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
    showChoiseStage(startStage, "choise-view.fxml", "Volgagrad Marathon 2025 - Choise");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
