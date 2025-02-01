module ru.dyomin.dyomin_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.dyomin.dyomin_task1 to javafx.fxml;
    exports ru.dyomin.dyomin_task1;
}