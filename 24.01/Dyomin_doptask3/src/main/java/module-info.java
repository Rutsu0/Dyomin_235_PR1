module ru.dyomin.dyomin_doptask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_doptask3 to javafx.fxml;
    exports ru.dyomin.dyomin_doptask3;
}