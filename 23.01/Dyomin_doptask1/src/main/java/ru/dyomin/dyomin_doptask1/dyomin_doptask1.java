package ru.dyomin.dyomin_doptask1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_doptask1 {

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
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'doptask1.fxml'.";
        assert chislo != null : "fx:id=\"chislo\" was not injected: check your FXML file 'doptask1.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'doptask1.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        int chis = Integer.parseInt(chislo.getText().trim());
        String result;

        if ((chis >= 10 && chis <= 99) || (chis >= -99 && chis <= -10)) {
            if (chis == 0) {
                result = "Нулевое число";
            } else {
                String otvet1 = chis > 0 ? "Положительное" : "Отрицательное";
                String otvet2 = (chis % 2 == 0) ? "чётное" : "нечётное";
                result = otvet1 + " " + otvet2;
            }
        } else {
            result = "Введено не двухзначное число";
        }
        otvet.setText(result);
    }
}
