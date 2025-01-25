package ru.dyomin.dyomin_doptask3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_doptask3 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private Button button;

    @FXML
    private Label result;

    @FXML
    void ww(ActionEvent event) {
        int a = Integer.parseInt(A.getText());
        int b = Integer.parseInt(B.getText());
        int remains;
        if (a >=0 && b>= 0) {
            if (b==0) {
                result.setText("A = " + a);
            } else {
                remains = a % b;
                result.setText("B= " + b + " остаток " + remains);
            }
        } else {
            result.setText("Введите положительное число");
        }
    }

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tusk4.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'tusk4.fxml'.";

    }

}
