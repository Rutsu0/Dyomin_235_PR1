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
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private TextField C;

    @FXML
    private Button but;

    @FXML
    private Label otvet1;

    @FXML
    private Label otvet2;

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'doptask1-view.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'doptask1-view.fxml'.";
        assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'doptask1-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'doptask1-view.fxml'.";
        assert otvet1 != null : "fx:id=\"otvet1\" was not injected: check your FXML file 'doptask1-view.fxml'.";
        assert otvet2 != null : "fx:id=\"otvet2\" was not injected: check your FXML file 'doptask1-view.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        int a = Integer.parseInt(A.getText().toString());
        int b = Integer.parseInt(B.getText().toString());
        int c = Integer.parseInt(C.getText().toString());
        otvet1.setText("Квадратов в прямоугольнике = " + (a*b/(c*4)));
        otvet2.setText("Площади не занято в прямоугольнике = " + (a*b%(c*4)));
    }
}
