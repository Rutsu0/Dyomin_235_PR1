module ru.dyomin.dyomin_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task3 to javafx.fxml;
    exports ru.dyomin.dyomin_task3;
}