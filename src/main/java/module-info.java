module com.example.publictransportmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.publictransportmanagement to javafx.fxml;
    exports com.example.publictransportmanagement;
}