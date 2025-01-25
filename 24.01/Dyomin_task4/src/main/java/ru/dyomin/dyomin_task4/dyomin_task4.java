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
    private TextField N;

    @FXML
    private Button button;

    @FXML
    private Label result;


    @FXML
    void ww(ActionEvent event) {
        int n = Integer.parseInt(N.getText());
        if (n > 1) {
            int k = 1;
            while (true) {
                if (3 * k > n) {
                    break;
                }
                k++;
            } result.setText("k = " + k);
        } else {
            result.setText("Введено число < 1");
        }
    }

    @FXML
    void initialize() {
        assert N != null : "fx:id=\"N\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'tusk4.fxml'.";

    }
}


