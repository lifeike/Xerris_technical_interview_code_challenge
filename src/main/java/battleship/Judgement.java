package battleship;

import java.util.Scanner;

/*
 * Author: Feike Li (feeco)
 * Title: Xerris battleship assessment
 * Date: 2020-08-09
 * */

public class Judgement {

    //  public boolean hitOrMiss(){}
    public boolean hitOrMiss(Player tempPlayer, int row, int column) {
        boolean flag = false;
        String[][] temp = tempPlayer.ship.getShip();
        String position = temp[row][column];

        if (position != null) {
            flag = true;
        }

        return flag;
    }

    //  check if board position has been taken
    public boolean taken(Player tempPlayer, int row, int column) {
        boolean flag = false;
        String[][] temp = tempPlayer.board.getBoard();
        String position = temp[row][column];

        if (position != null) {
            flag = true;
        }

        return flag;
    }

    //core logic of game play
    public void gamePlay(Player player1, Player player2) {

        System.out.println("Ok, let's play the game.");
        Scanner scanner = new Scanner(System.in);

        //calculate the final result
        int ship1HitCount = 0, ship2HitCount = 0;

        while (true) {

            //receive player 1 input
            int playerCode = 1;
            System.out.println("player " + playerCode + " fire your arm.");
            System.out.println("row number");
            int player1Row = scanner.nextInt() - 1;
            System.out.println("column number");
            int player1Column = scanner.nextInt() - 1;

            //check if taken
            Judgement play1Judgement = new Judgement();
            if (play1Judgement.taken(player1, player1Row, player1Column)) {
                System.out.println("This position has been taken.");
            } else {

                //add mark to player 1 board
                String[][] temp = player1.board.getBoard();
                temp[player1Row][player1Column] = "x";
                player1.board.setBoard(temp);
                player1.displayYourBoard();

                //check if hit or miss or win
                if (play1Judgement.hitOrMiss(player2, player1Row, player1Column)) {
                    ship1HitCount++;
                    System.out.println("You hit it.");
                    if (ship1HitCount == 3) {
                        System.out.println("You sunk rival's ship.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("You missed it, one more time.");
                }
            }

            //receive player 2 input
            playerCode++;
            System.out.println("player " + playerCode + " fire your arm.");
            System.out.println("row number");
            int player2Row = scanner.nextInt() - 1;
            System.out.println("column number");
            int player2Column = scanner.nextInt() - 1;

            //check if taken
            Judgement player2Judgement = new Judgement();
            if (player2Judgement.taken(player2, player2Row, player2Column)) {
                System.out.println("This position has been taken");
            } else {
                //add mark to player 2 board
                String[][] temp = player2.board.getBoard();
                temp[player2Row][player2Column] = "x";
                player2.board.setBoard(temp);
                player2.displayYourBoard();

                //check if hit or miss or win
                if (player2Judgement.hitOrMiss(player1, player2Row, player2Column)) {
                    ship2HitCount++;
                    System.out.println("You hit it.");
                    if (ship2HitCount == 3) {
                        System.out.println("You win.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("You missed it, one more time.");
                }
            }

        }

    }

    //check initial placement conflict
    public boolean placementConflict(Player player1, Player player2) {
        boolean flag = false;
        String[][] temp1, temp2;
        temp2 = player2.ship.getShip();
        temp1 = player1.ship.getShip();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (temp1[i][j] != null) {
                    if (temp2[i][j] != null) {
                        flag = true;
                        break;
                    }
                }
            }
        }

        return flag;
    }

}
