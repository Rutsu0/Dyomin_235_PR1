package ru.dyomin.domin_task2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class domin_task2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField DignityCard;

    @FXML
    private TextField SuitCard;

    @FXML
    private Button button;

    @FXML
    private Label card;

    @FXML
    void initialize() {
        assert DignityCard != null : "fx:id=\"DignityCard\" was not injected: check your FXML file 'task2.fxml'.";
        assert SuitCard != null : "fx:id=\"SuitCard\" was not injected: check your FXML file 'task2.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task2.fxml'.";
        assert card != null : "fx:id=\"card\" was not injected: check your FXML file 'task2.fxml'.";

    }

    public void ww(ActionEvent event) {
        int DC = Integer.parseInt(this.DignityCard.getText().toString());
        int SC = Integer.parseInt(this.SuitCard.getText().toString());
        String Dignity = "";
        String Suit = "";
        if (DC >= 6 && DC <= 14 && SC >= 1 && SC <= 4) {
            switch (DC) {
                case 6 -> Dignity = "6";
                case 7 -> Dignity = "7";
                case 8 -> Dignity = "8";
                case 9 -> Dignity = "9";
                case 10 -> Dignity = "10";
                case 11 -> Dignity = "Валет";
                case 12 -> Dignity = "Дама";
                case 13 -> Dignity = "Король";
                case 14 -> Dignity = "Туз";
            }

            switch (SC) {
                case 1 -> Suit = "Пики";
                case 2 -> Suit = "Крести";
                case 3 -> Suit = "Бубны";
                case 4 -> Suit = "Черви";
            }

            this.card.setText("Вы выбрали карту " + Suit + " " + Dignity);
        } else {
            this.card.setText("Введённая карта должна быть по достоинству от 6 до 14 или масть от 1 до 4");
        }
    }
}