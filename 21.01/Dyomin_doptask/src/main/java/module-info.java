module ru.dyomin.dyomin_doptask {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_doptask to javafx.fxml;
    exports ru.dyomin.dyomin_doptask;
}