package ru.dyomin.dyomin_marathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.dyomin.dyomin_marathon.util.manager.showStartStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       showStartStage(stage, "start-view.fxml", "Volgograd Marathon 2025");
    }

    public static void main(String[] args) {
        launch();
    }
}