package ru.dyomin.dyomin_task1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label PervChislo;

    @FXML
    private Button but;

    @FXML
    private TextField chislo;

    @FXML
    void initialize() {
        assert PervChislo != null : "fx:id=\"PervChislo\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert chislo != null : "fx:id=\"chislo\" was not injected: check your FXML file 'task1-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        int PC = Integer.parseInt(chislo.getText());
        if (PC>=100 && PC<=999) {
            PervChislo.setText("Первая цифру данного числа = " + (PC / 100));
        } else {
                PervChislo.setText("Введена неправильная цифра");
        }
    }
}