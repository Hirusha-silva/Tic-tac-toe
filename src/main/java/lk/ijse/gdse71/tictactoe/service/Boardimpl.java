package lk.ijse.gdse71.tictactoe.service;

public class Boardimpl implements Board {
    private Piece[][] pieces = new Piece[3][3];

//    public Boardimpl() {
//        initializeBoard();
//    }

    public Piece[][] getPieces() {
        return pieces;
    }

    @Override
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pieces[i][j] = Piece.EMPTY;
            }
        }
    }

    @Override
    public boolean isLegalMove(int row, int col) {
        return false;
    }

    @Override
    public void updateMove(int row, int col, Piece piece) {

    }

    @Override
    public Winner checkWinner() {
        return null;
    }

    @Override
    public void printBoard() {

    }
}
