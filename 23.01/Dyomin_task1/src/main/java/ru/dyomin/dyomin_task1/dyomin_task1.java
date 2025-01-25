package ru.dyomin.dyomin_task1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Chislo;

    @FXML
    private TextField Crat;

    @FXML
    private Button but;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert Chislo != null : "fx:id=\"Chislo\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Crat != null : "fx:id=\"Crat\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        int chis = Integer.parseInt(Chislo.getText().toString());
        int crat = Integer.parseInt(Crat.getText().toString());
        if (chis>=10 && chis<=99){
            int a,b;
            a = chis / 10;
            b = chis % 10;
            if ((a + b) % crat == 0) {
                otvet.setText("Число кратно");
            } else {
                otvet.setText("Число не кртано");
            }
        } else {
            otvet.setText("Введено не двухкратное число");
        }
    }
}
