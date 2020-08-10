package battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getBoard() {
        String[][] test = new String[8][8];
        test[1][1] = "x";
        Board board = new Board(test);
        assertEquals(board.getBoard()[1][1],test[1][1]);
    }

    @Test
    void setBoard() {
        String[][] test = new String[8][8];
        test[1][1] = "x";
        Board board = new Board();
        board.setBoard(test);
        assertEquals("x",board.getBoard()[1][1]);
    }
}