module com.example.crudjpaa {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.crudjpaa to javafx.fxml;
    exports com.example.crudjpaa;
}