module com.example.playingwjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.playingwjavafx to javafx.fxml;
    exports com.example.playingwjavafx;
}