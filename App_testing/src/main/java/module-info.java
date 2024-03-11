module com.mycompany.app_testing {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.app_testing to javafx.fxml;
    exports com.mycompany.app_testing;
}
