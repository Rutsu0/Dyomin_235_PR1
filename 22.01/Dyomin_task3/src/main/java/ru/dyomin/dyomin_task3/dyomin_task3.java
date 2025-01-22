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
    private Button but;

    @FXML
    private TextField den;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task3-view.fxml'.";
        assert den != null : "fx:id=\"den\" was not injected: check your FXML file 'task3-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'task3-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        int day = Integer.parseInt(den.getText().toString());
        if (day >= 1 && day <= 365) {
            int d = (day + 5) % 7;
            if (d == 0) {
                d = 7;
            }
            otvet.setText("номер дня нидели = " + d);
        } else {
            otvet.setText("Введите число от 1 до 365");
        }
    }
}
