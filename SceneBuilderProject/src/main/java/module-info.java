module com.example.scenebuilderproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.scenebuilderproject to javafx.fxml;
    exports com.example.scenebuilderproject;
}