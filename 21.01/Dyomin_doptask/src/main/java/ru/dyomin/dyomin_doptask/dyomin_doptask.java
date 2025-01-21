package ru.dyomin.dyomin_doptask;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_doptask {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField A1;

    @FXML
    private TextField A2;

    @FXML
    private TextField B1;

    @FXML
    private TextField B2;

    @FXML
    private TextField C1;

    @FXML
    private TextField C2;

    @FXML
    private Label X;

    @FXML
    private Label Y;

    @FXML
    private Button but;

    @FXML
    void initialize() {
        assert A1 != null : "fx:id=\"A1\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert A2 != null : "fx:id=\"A2\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert B1 != null : "fx:id=\"B1\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert B2 != null : "fx:id=\"B2\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert C1 != null : "fx:id=\"C1\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert C2 != null : "fx:id=\"C2\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert X != null : "fx:id=\"X\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert Y != null : "fx:id=\"Y\" was not injected: check your FXML file 'doptask-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'doptask-view.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        float a1 = Float.parseFloat(A1.getText().toString());
        float a2 = Float.parseFloat(A2.getText().toString());
        float b1 = Float.parseFloat(B1.getText().toString());
        float b2 = Float.parseFloat(B2.getText().toString());
        float c1 = Float.parseFloat(C1.getText().toString());
        float c2 = Float.parseFloat(C2.getText().toString());
        double x,y,d;
        d = a1*b2-a2*b1;
        X.setText("X= " + (c1*b2-c2*b1)/d);
        Y.setText("Y= " + (a1*c2-a2*c1)/d);
    }
}
