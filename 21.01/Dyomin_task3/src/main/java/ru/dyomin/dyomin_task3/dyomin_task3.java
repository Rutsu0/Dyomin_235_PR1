package ru.dyomin.dyomin_task3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task3 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label C;

    @FXML
    private TextField F;

    @FXML
    private Button but;

    @FXML
    void initialize() {
        assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'task3-view.fxml'.";
        assert F != null : "fx:id=\"F\" was not injected: check your FXML file 'task3-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task3-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        float f = Float.parseFloat(F.getText().toString());
        C.setText("Температура в °C" + (f - 32)*5/9);
    }
}
