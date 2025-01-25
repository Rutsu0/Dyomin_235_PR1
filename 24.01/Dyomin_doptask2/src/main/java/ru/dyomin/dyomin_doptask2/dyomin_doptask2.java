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
    private Button button;

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    void ww(ActionEvent event) {
        int num = Integer.parseInt(number.getText());
        String results = "";
        int hundreds, tens, units;

        if (num >= 100 && num <= 999) {
            hundreds = num / 100;
            switch (hundreds) {
                case 1: results += "сто"; break;
                case 2: results += "двести"; break;
                case 3: results += "триста"; break;
                case 4: results += "четыреста"; break;
                case 5: results += "пятьсот"; break;
                case 6: results += "шестьсот"; break;
                case 7: results += "семьсот"; break;
                case 8: results += "восемьсот"; break;
                case 9: results += "девятьсот"; break;
            }

            tens = (num % 100) / 10;
            units = num % 10;

            if (tens == 1) {
                switch (units) {
                    case 0: results += " десять"; break;
                    case 1: results += " одиннадцать"; break;
                    case 2: results += " двенадцать"; break;
                    case 3: results += " тринадцать"; break;
                    case 4: results += " четырнадцать"; break;
                    case 5: results += " пятнадцать"; break;
                    case 6: results += " шестнадцать"; break;
                    case 7: results += " семнадцать"; break;
                    case 8: results += " восемнадцать"; break;
                    case 9: results += " девятнадцать"; break;
                }
            } else {
                switch (tens) {
                    case 2: results += " двадцать"; break;
                    case 3: results += " тридцать"; break;
                    case 4: results += " сорок"; break;
                    case 5: results += " пятьдесят"; break;
                    case 6: results += " шестьдесят"; break;
                    case 7: results += " семьдесят"; break;
                    case 8: results += " восемьдесят"; break;
                    case 9: results += " девяносто"; break;
                }

                switch (units) {
                    case 1: results += " один"; break;
                    case 2: results += " два"; break;
                    case 3: results += " три"; break;
                    case 4: results += " четыре"; break;
                    case 5: results += " пять"; break;
                    case 6: results += " шесть"; break;
                    case 7: results += " семь"; break;
                    case 8: results += " восемь"; break;
                    case 9: results += " девять"; break;
                }
            }

        } else {
            results = "Введите число от 100 до 999";
        }
        result.setText(results);
    }

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert number != null : "fx:id=\"number\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'tusk4.fxml'.";

    }

}
