package ru.dyomin.dyomin_task4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label C;

    @FXML
    private TextField N;

    @FXML
    private Button but;

    @FXML
    void initialize() {
        assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'task4-view.fxml'.";
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'task4-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task4-view.fxml'.";

    }


    public void ww(ActionEvent actionEvent) {
        float n = Float.parseFloat(N.getText().toString());
        double z = 0;
        z = (n + (1/Math.tan(n+1)))/(Math.sin(n+1));
        C.setText("C= " + Math.abs((n+Math.pow(z,5))/(3+z)));
    }
}
