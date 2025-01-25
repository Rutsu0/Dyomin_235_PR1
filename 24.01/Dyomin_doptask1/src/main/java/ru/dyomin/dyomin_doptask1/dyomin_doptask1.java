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
    private Button button;

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    void ww(ActionEvent event) {
        int num = Integer.parseInt(this.number.getText());
        String results = "";
        if (num >= 10 && num <= 40) {
            int tens = num / 10;
            int units = num % 10;
            if (tens == 1) {
                switch (units) {
                    case 0 -> results = results + "десять";
                    case 1 -> results = results + "одиннадцать";
                    case 2 -> results = results + "двенадцать";
                    case 3 -> results = results + "тринадцать";
                    case 4 -> results = results + "четырнадцать";
                    case 5 -> results = results + "пятнадцать";
                    case 6 -> results = results + "шестнадцать";
                    case 7 -> results = results + "семнадцать";
                    case 8 -> results = results + "восемнадцать";
                    case 9 -> results = results + "девятнадцать";
                }
            } else {
                switch (tens) {
                    case 2 -> results = results + "двадцать";
                    case 3 -> results = results + "тридцать";
                    case 4 -> results = results + "сорок";
                }

                switch (units) {
                    case 1 -> results = results + " один";
                    case 2 -> results = results + " два";
                    case 3 -> results = results + " три";
                    case 4 -> results = results + " четыре";
                    case 5 -> results = results + " пять";
                    case 6 -> results = results + " шесть";
                    case 7 -> results = results + " семь";
                    case 8 -> results = results + " восемь";
                    case 9 -> results = results + " девять";
                }
            }
        } else {
            results = "Введите число от 10 до 40";
        }

        this.result.setText(results + " учебных заданий");
    }

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert number != null : "fx:id=\"number\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'tusk4.fxml'.";

    }

}
