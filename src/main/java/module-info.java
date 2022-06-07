module com.example.homeworkls4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homeworkls4 to javafx.fxml;
    exports com.example.homeworkls4;
}