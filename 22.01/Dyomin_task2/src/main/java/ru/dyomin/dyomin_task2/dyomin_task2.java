package ru.dyomin.dyomin_task2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dyomin_task2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but;

    @FXML
    private TextField chislo;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert chislo != null : "fx:id=\"chislo\" was not injected: check your FXML file 'task2-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'task2-view.fxml'.";

    }

    public void ww(ActionEvent event) {
        int chis = Integer.parseInt(chislo.getText().toString());
        if (chis>=1000) {
            otvet.setText("Ответ = " + ((chis / 1000) % 10 ));
        } else {
            otvet.setText("Введенно число менье 1000");
        }
    }
}
