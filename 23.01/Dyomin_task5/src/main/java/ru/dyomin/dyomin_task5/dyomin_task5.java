package ru.dyomin.dyomin_task5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task5 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField X;

    @FXML
    private TextField Y;

    @FXML
    private Button but;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert X != null : "fx:id=\"X\" was not injected: check your FXML file 'Untitled'.";
        assert Y != null : "fx:id=\"Y\" was not injected: check your FXML file 'Untitled'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'Untitled'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'Untitled'.";


    }

    public void ww(ActionEvent actionEvent) {
        double x = Double.parseDouble(X.getText().toString());
        double y = Double.parseDouble(Y.getText().toString());
        double cvadrat = Math.pow(x, 2) + Math.pow(y, 2);
        if (cvadrat > Math.pow(40, 2)) {
            otvet.setText("Точка входит в зону");
        } else if (x == 40 || x == -40 || y == -40 || y == 40) {
            otvet.setText("Находится на границе зоны");
        } else {
            otvet.setText("Точка не входит в зону");
        }
    }
}
