module ru.dyomin.dyomin {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin to javafx.fxml;
    exports ru.dyomin.dyomin;
}