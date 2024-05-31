module org.example.wisterisapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.wisterisapp to javafx.fxml;
    exports org.example.wisterisapp;
}