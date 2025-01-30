package ru.dyomin.dyomin_marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dyomin.dyomin_marathon.util.manager.*;

public class registorEventController {

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showChoiseStage(startStage,"choise-view.fxml", "Volgagrad Marathon 2025");

    }

    @FXML
    void endButtonOnAction(ActionEvent event) {
        showEndStage(startStage,"end-view.fxml", "Volgagrad Marathon 2025");

    }

}
