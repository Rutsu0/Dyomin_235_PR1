module ru.dyomin.dyomin_task {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.dyomin.dyomin_task to javafx.fxml;
    exports ru.dyomin.dyomin_task;
}