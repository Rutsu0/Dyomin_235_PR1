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
    private TextField N;

    @FXML
    private Button button;

    @FXML
    private Label result;

    @FXML
    void initialize() {
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'task5.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task5.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'task5.fxml'.";

    }

    public void resultButton(ActionEvent actionEvent) {
        int n = Integer.parseInt(N.getText().toString());
        if (n > 0) {
            double sum = 0;
            double x = 1, y = 1;
            for (int i = 1; i <= n; i++) {
                sum += x / (1+Math.abs(y));
                x = 0.3*x;
                y = x + y;
            }
            result.setText("Ответ уравнения = " + sum);
        } else {
            result.setText("Введите число > 0");
        }
    }
}
