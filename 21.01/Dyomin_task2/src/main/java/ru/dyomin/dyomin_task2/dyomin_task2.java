package ru.dyomin.dyomin_task2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private Button but;

    @FXML
    private Label perv;

    @FXML
    private Label vtor;

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert perv != null : "fx:id=\"perv\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert vtor != null : "fx:id=\"vtor\" was not injected: check your FXML file 'task2-view.fxml'.";

    }


    public void ww(ActionEvent event) {
        float a = Float.parseFloat(A.getText().toString());
        float b = Float.parseFloat(B.getText().toString());
        perv.setText("A=" + b);
        vtor.setText("B=" + a);
    }
}
