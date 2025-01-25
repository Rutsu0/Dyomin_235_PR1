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
    private Button Button;

    @FXML
    private TextField Day;

    @FXML
    private TextField Month;

    @FXML
    private Label nextDay;

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task1.fxml'.";
        assert Day != null : "fx:id=\"Day\" was not injected: check your FXML file 'task1.fxml'.";
        assert Month != null : "fx:id=\"Month\" was not injected: check your FXML file 'task1.fxml'.";
        assert nextDay != null : "fx:id=\"nextDay\" was not injected: check your FXML file 'task1.fxml'.";

    }

    public void ww(ActionEvent event) {
        int day = Integer.parseInt(Day.getText().toString());
        int month = Integer.parseInt(Month.getText().toString());
        int DaysInMonth = 0;
        if (day < 1 || month < 1 || month > 12 || day > 31) {
            nextDay.setText("Ошибка в написании дня или месяца");
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    DaysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    DaysInMonth = 30;
                    break;
                case 2:
                    DaysInMonth = 28;
                    break;
            }
        }
        if (day > DaysInMonth) {
            nextDay.setText("Ошибка в написании дня или месяца ");
        } else {
            if (day < DaysInMonth) {
                day++;
            } else if (day == DaysInMonth) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                }
            }
            nextDay.setText("Следующая дата " + day + " " + month);
        }
    }
}