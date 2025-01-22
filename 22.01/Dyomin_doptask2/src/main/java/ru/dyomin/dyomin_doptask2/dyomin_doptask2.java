package ru.dyomin.dyomin_doptask2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_doptask2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Vek;

    @FXML
    private Button but;

    @FXML
    private TextField god;

    @FXML
    void initialize() {
        assert Vek != null : "fx:id=\"Vek\" was not injected: check your FXML file 'doptask2-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'doptask2-view.fxml'.";
        assert god != null : "fx:id=\"god\" was not injected: check your FXML file 'doptask2-view.fxml'.";

    }

    public void ww(ActionEvent actionEvent) {
        int God = Integer.parseInt(god.getText().toString());
        if (God >= 0){
            Vek.setText("Год который вы ввели равен " + (((God - 1) / 100)+1) + (" веку"));
        } else {
            Vek.setText("Год должен быть положительным");
        }


        //int God = Integer.parseInt(god.getText().toString());
        //int century = ((God - 1) / 100) + 1;
        //if (God >= 0) {
        //    Vek.setText(String.valueOf(century));
        //} else {
        //    Vek.setText("Год должен быть положительным");

    }
}