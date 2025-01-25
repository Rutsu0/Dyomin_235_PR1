module ru.dyomin.dyomin_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_task5 to javafx.fxml;
    exports ru.dyomin.dyomin_task5;
}