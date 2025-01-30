package ru.dyomin.dyomin_marathon.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.dyomin.dyomin_marathon.util.manager.*;

public class endController {

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showRegistorEventStage(startStage,"regEvent-view.fxml", "Volgagrad Marathon 2025");

    }

    @FXML
    void closeAppButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
