package ru.dyomin.dyomin_task4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.css.Match;
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
    private TextField B;

    @FXML
    private TextField C;

    @FXML
    private Button but;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        int a = Integer.parseInt(A.getText().toString());
        int b = Integer.parseInt(B.getText().toString());
        int c = Integer.parseInt(C.getText().toString());
        int m, k;
        double y;
        m = (int) ((a + Math.pow(b,2)) / c);
        k = m / 3;
        if (k == 1) {
            y = Math.pow(Math.E,m + c);
            otvet.setText("y= " + y);
        } else if (k == 0){
            y = Math.log(a / b);
            otvet.setText("y= " + y);
        } else {
            y = Math.sqrt(Math.abs((Math.pow(a + b,2)) + c));
            otvet.setText("y= " +y);
        }
    }
}
