module com.mycompany.lab11_dawel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab11_dawel to javafx.fxml;
    exports com.mycompany.lab11_dawel;
}
