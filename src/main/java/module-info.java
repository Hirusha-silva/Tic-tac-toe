module lk.ijse.gdse71.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.ijse.gdse71.tictactoe.controller to javafx.fxml;
    exports lk.ijse.gdse71.tictactoe;
}