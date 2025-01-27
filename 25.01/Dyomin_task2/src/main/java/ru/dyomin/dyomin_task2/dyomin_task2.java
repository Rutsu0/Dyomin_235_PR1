package ru.dyomin.dyomin_task2;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class dyomin_task2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int n = data.get(0);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            if (m % 10 == 3 && m > max) {
                    max = m;
            }
        }

        if (max != 0) {
            answerLabel.setText(String.valueOf(max));
        } else {
            answerLabel.setText("Чисел, оканчивающихся на 3, нет");
        }

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }

    }

    @FXML
    void cancelonActionOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
        assert OkButton != null : "fx:id=\"OkButton\" was not injected: check your FXML file 'task1.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'task1.fxml'.";
        assert answerLabel != null : "fx:id=\"answerLabel\" was not injected: check your FXML file 'task1.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'task1.fxml'.";
        assert dataListView != null : "fx:id=\"dataListView\" was not injected: check your FXML file 'task1.fxml'.";
        assert numberTextField != null : "fx:id=\"numberTextField\" was not injected: check your FXML file 'task1.fxml'.";

    }

}
