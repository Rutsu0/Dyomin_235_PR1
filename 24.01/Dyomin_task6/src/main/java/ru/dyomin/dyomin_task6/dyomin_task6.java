package ru.dyomin.dyomin_task6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task6 {

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
    void ww(ActionEvent event) {
        int n = Integer.parseInt(N.getText());
        boolean foundOne = false;
        if (n > 0) {
            while (n > 0) {
                if (n % 10 == 1) {
                    foundOne = true;
                    break;
                }
                n /= 10;
            }

            if (foundOne) {
                result.setText("Цифра 1 имеется");
            } else {
                result.setText("Цифра 1 не найдена");
            }
        } else {
            result.setText("Введите чилос >0");
        }
    }

    @FXML
    void initialize() {
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'tusk4.fxml'.";

    }
}
