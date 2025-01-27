module ru.dyomin.dyomin_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task1 to javafx.fxml;
    exports ru.dyomin.dyomin_task1;
}