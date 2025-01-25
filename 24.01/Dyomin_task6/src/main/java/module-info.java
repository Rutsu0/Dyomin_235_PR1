module ru.dyomin.dyomin_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task6 to javafx.fxml;
    exports ru.dyomin.dyomin_task6;
}