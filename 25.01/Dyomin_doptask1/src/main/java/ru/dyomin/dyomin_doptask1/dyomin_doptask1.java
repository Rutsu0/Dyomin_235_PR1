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
    private TextField K;

    @FXML
    private TextField N;

    @FXML
    private Button button;

    @FXML
    private Label result;

    @FXML
    void resultButton(ActionEvent event) {
        int k = Integer.parseInt(K.getText().toString());
        int n = Integer.parseInt(N.getText().toString());
        double sum = 0;
        if (n > 0 || k > 0) {
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(i, k);
            }
            result.setText("Ответ уравнения = " + sum);
        } else {
            result.setText("Исправьте K или N на положительное число");
        }
    }

    @FXML
    void initialize() {
        assert K != null : "fx:id=\"K\" was not injected: check your FXML file 'task5.fxml'.";
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'task5.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task5.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'task5.fxml'.";

    }

}
