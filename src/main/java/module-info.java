module lk.ijse.gdse71.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.gdse71.tictactoe.controller to javafx.fxml;
    exports lk.ijse.gdse71.tictactoe;
}