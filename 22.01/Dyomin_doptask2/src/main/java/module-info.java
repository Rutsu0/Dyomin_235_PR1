module ru.dyomin.dyomin_doptask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_doptask2 to javafx.fxml;
    exports ru.dyomin.dyomin_doptask2;
}