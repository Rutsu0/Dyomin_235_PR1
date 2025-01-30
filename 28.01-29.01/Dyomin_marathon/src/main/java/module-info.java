module ru.dyomin.dyomin_marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.dyomin_marathon to javafx.fxml;
    exports ru.dyomin.dyomin_marathon;
    exports ru.dyomin.dyomin_marathon.controller;
    opens ru.dyomin.dyomin_marathon.controller to javafx.fxml;
}