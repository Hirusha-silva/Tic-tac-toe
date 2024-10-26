package lk.ijse.gdse71.tictactoe.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import lk.ijse.gdse71.tictactoe.service.BoardUi;
import lk.ijse.gdse71.tictactoe.service.Piece;

public class BoderController implements BoardUi {

    @FXML
    private AnchorPane anchor1;

    @FXML
    private Button btn00;

    @FXML
    private Button btn01;

    @FXML
    private Button btn02;

    @FXML
    private Button btn10;

    @FXML
    private Button btn11;

    @FXML
    private Button btn12;

    @FXML
    private Button btn20;

    @FXML
    private Button btn21;

    @FXML
    private Button btn22;

    @FXML
    private GridPane grid;

    @FXML
    private ImageView ima;

    @FXML
    void buttonClicked(ActionEvent event) {

    }

    @Override
    public void Update(int row, int col, Piece piece) {

    }

    @Override
    public void NotifyWinner(Piece winner) {

    }
}
