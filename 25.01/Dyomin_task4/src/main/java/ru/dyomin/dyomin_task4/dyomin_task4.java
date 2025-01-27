package ru.dyomin.dyomin_task4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField A;

    @FXML
    private TextField N;

    @FXML
    private Button button;

    @FXML
    private Label result;

    @FXML
    void Button(ActionEvent event) {
        double a = Double.parseDouble(A.getText().toString());
        int n = Integer.parseInt(N.getText().toString());
        double sum = 0;
        double nextsum = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                nextsum = Math.pow(a, i);
                if (i % 2 == 0) {
                    sum += nextsum;
                } else {
                    sum -= nextsum;
                }
            }
            result.setText("Значение выражения: " + sum);
        } else {
            result.setText("Введено число > 0");
        }


    }

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'task1.fxml'.";
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'task1.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task1.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'task1.fxml'.";

    }

}
