module com.cdev.rotayoklamaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.cdev.rotayoklamaapp to javafx.fxml;
    exports com.cdev.rotayoklamaapp;
}