module com.example.demo233 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo233 to javafx.fxml;
    exports com.example.demo233;
}