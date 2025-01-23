module ru.dyomin.dyomin_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task2 to javafx.fxml;
    exports ru.dyomin.dyomin_task2;
}