module com.example.exercicio04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio04 to javafx.fxml;
    exports com.example.exercicio04;
}