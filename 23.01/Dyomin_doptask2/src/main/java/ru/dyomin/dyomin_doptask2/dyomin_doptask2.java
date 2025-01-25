package ru.dyomin.dyomin_doptask2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_doptask2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but;

    @FXML
    private TextField chislo;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'doptask2.fxml'.";
        assert chislo != null : "fx:id=\"chislo\" was not injected: check your FXML file 'doptask2.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'doptask2.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        int chis = Integer.parseInt(chislo.getText().trim());
        String result;

        if (chis < 1 || chis > 999) {
            result = "Число должно быть в диапазоне от 1 до 999";
        } else {
            String parity = (chis % 2 == 0) ? "четное" : "нечетное";
            String digits;

            if (chis < 10) {
                digits = "однозначное";
            } else if (chis < 100) {
                digits = "двузначное";
            } else {
                digits = "трехзначное";
            }

            result = parity + " " + digits + " число";
        }

        otvet.setText(result);
    }
}
