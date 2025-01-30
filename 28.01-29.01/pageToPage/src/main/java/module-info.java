module ru.dyomin.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dyomin.pagetopage to javafx.fxml;
    exports ru.dyomin.pagetopage;
    exports ru.dyomin.pagetopage.controller;
    opens ru.dyomin.pagetopage.controller to javafx.fxml;
}