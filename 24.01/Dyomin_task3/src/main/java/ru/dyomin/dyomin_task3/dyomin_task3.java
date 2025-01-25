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
    private TextField ElementSelection;

    @FXML
    private Button button;

    @FXML
    private TextField nuber;

    @FXML
    private Label result;

    @FXML
    void initialize() {
        assert ElementSelection != null : "fx:id=\"ElementSelection\" was not injected: check your FXML file 'task3.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'task3.fxml'.";
        assert nuber != null : "fx:id=\"nuber\" was not injected: check your FXML file 'task3.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'task3.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        int ES = Integer.parseInt(ElementSelection.getText().toString());
        double num = Double.parseDouble(nuber.getText().toString());
        double a, R1, R2, S;
        String results;

        switch (ES) {
            case 1:
                a = num;
                R1 = a * Math.sqrt(3) / 6;
                R2 = 2 * R1;
                S = (a * a * Math.sqrt(3)) / 4;
                results = "a = " + a + " R1 = " + R1 + " R2 = " + R2 + " S = " + S;
                break;

            case 2:
                R1 = num;
                a = (6 * R1) / Math.sqrt(3);
                R2 = 2 * R1;
                S = 3 * R1 * R1;
                results = "R1 = " + R1 + " a = " + a + " R2 = " + R2 + " S = " + S;
                break;

            case 3:
                R2 = num;
                a = (3 * R2) / Math.sqrt(3);
                R1 = R2 / 2;
                S = (3 * R2 * R2) / 4;
                results = "R2 = "+ R2 + " a = " + a + " R1 = " + R1 + " S = " + S;
                break;

            case 4:
                S = num;
                a = Math.sqrt((4 * S) / Math.sqrt(3));
                R1 = (a * Math.sqrt(3)) / 6;
                R2 = (a * Math.sqrt(3)) / 3;
                results = "S = " + S + " a = " + a + " R1 = " + R1 + " R2 = " + R2;
                break;
            default:
                results = "Ошибка: неверный номер элемента.";
        }
        result.setText(results);
    }
}