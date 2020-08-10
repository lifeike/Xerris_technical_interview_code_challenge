package battleship;

/*
 * Author: Feike Li (feeco)
 * Title: Xerris battleship assessment
 * Date: 2020-08-09
 * */

public class Player {

    Board board = new Board();
    Ship ship = new Ship();

    public void createShip(int row, int column, int direction) {
        String[][] temp = new String[8][8];
        temp[row][column] = "x";
        if (direction == 1) {
            //1.vertical
            temp[row + 1][column] = "x";
            temp[row + 2][column] = "x";

        } else if (direction == 2) {
            //2.horizontal
            temp[row][column + 1] = "x";
            temp[row][column + 2] = "x";
        } else {
            System.out.println("Wrong direction.");
        }

        ship.setShip(temp);
        board.setBoard(temp);
    }

    public void displayYourBoard() {
        String[][] temp = board.getBoard();
        System.out.println("  A B C D E F G H");

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                if (temp[i][j] == null) {
                    System.out.print("~ ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

}
