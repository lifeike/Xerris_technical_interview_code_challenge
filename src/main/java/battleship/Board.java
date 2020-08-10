package battleship;

/*
 * Author: Feike Li (feeco)
 * Title: Xerris battleship assessment
 * Date: 2020-08-09
 * */

public class Board {

    String[][] board = new String[8][8];

    public Board(){}

    public Board(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

}
