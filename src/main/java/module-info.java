module com.example.lab00 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab00 to javafx.fxml;
    exports com.example.lab00;
}