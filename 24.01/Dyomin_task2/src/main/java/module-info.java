module ru.dyomin.domin_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.domin_task2 to javafx.fxml;
    exports ru.dyomin.domin_task2;
}