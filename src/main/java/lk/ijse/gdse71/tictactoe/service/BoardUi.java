package lk.ijse.gdse71.tictactoe.service;

public interface BoardUi {
    void Update(int row, int col, Piece piece);
    void NotifyWinner(Piece winner);
}
