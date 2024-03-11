module com.mycompany.st_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.st_app to javafx.fxml;
    exports com.mycompany.st_app;
}
