module com.example.search_device {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.compiler;
    requires java.desktop;


    opens com.example.search_device to javafx.fxml;
    exports com.example.search_device;
}