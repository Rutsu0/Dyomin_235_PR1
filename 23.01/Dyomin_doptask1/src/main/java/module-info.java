module ru.dyomin.dyomin_doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_doptask1 to javafx.fxml;
    exports ru.dyomin.dyomin_doptask1;
}