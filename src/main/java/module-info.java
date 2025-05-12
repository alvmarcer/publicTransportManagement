module com.example.publictransportmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.publictransportmanagement to javafx.fxml;
    exports com.example.publictransportmanagement;
}