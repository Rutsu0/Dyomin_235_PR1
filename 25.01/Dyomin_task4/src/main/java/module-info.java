module ru.dyomin.dyomin_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task4 to javafx.fxml;
    exports ru.dyomin.dyomin_task4;
}