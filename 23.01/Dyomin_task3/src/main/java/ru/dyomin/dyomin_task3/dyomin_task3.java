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
        if (a == b) {
            otvet.setText("Отличное число третье");
        } else if (a == c) {
            otvet.setText("Отличное число второе");
        } else {
            otvet.setText("Отличное число перовое");
        }
    }
}
