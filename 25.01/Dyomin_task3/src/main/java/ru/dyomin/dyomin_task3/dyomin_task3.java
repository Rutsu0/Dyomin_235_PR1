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
    private Button button;

    @FXML
    private TextField chisl;

    @FXML
    private Label result;

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task1.fxml'.";
        assert chisl != null : "fx:id=\"chisl\" was not injected: check your FXML file 'task1.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'task1.fxml'.";

    }

    public void Button(ActionEvent actionEvent) {
        int chis = Integer.parseInt(chisl.getText().toString());
        if (chis > 0) {
            double sum = 0;
            for (int i = 1; i <= chis; i++) {
                sum += 1 / i;
                result.setText("Сумма :" + sum);
            }
        } else {
            result.setText("Введите число > 0");
        }
    }
}
