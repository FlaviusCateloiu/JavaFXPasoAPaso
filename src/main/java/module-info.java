module com.example.javafxpasoapaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxpasoapaso to javafx.fxml;
    exports com.example.javafxpasoapaso;
}