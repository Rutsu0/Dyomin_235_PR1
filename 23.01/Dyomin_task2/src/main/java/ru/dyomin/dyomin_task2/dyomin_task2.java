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
    private TextField A1;

    @FXML
    private Label A2;

    @FXML
    private TextField B1;

    @FXML
    private Label B2;

    @FXML
    private Button but;

    @FXML
    void initialize() {
        assert A1 != null : "fx:id=\"A1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert A2 != null : "fx:id=\"A2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert B1 != null : "fx:id=\"B1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert B2 != null : "fx:id=\"B2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        double a1 = Double.parseDouble(A1.getText().toString());
        double b1 = Double.parseDouble(B1.getText().toString());
            if (a1 >= b1) {
                double c;
                c = a1;
                a1 = b1;
                b1 = c;
                A2.setText("A= " + a1);
                B2.setText("B= " + b1);
            } else {
                A2.setText("A= " + a1);
                B2.setText("B= " + b1);
            }
    }
}
