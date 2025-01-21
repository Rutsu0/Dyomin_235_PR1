package ru.dyomin.dyomin_task1;

import java.net.URL;
import java.util.DuplicateFormatFlagsException;
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
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private Button butt;

    @FXML
    private Label chas2;

    @FXML
    private Label proz;

    @FXML
    private Label raz;

    @FXML
    private Label sum;

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert butt != null : "fx:id=\"butt\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert chas2 != null : "fx:id=\"chas2\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert proz != null : "fx:id=\"proz\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert raz != null : "fx:id=\"raz\" was not injected: check your FXML file 'task1-view.fxml'.";
        assert sum != null : "fx:id=\"sum\" was not injected: check your FXML file 'task1-view.fxml'.";

    }


    public void ww(ActionEvent event) {
        float a = Float.parseFloat(A.getText().toString());
        float b = Float.parseFloat(B.getText().toString());
        sum.setText("" + (a + b));
        raz.setText("" + (a - b));
        proz.setText("" + (a * b));
        chas2.setText("" + (Math.pow(a,2)/Math.pow(b,2)));
    }
}
