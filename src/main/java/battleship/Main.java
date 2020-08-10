package battleship;

import java.util.Scanner;

/*
 * Author: Feike Li (feeco)
 * Title: Xerris battleship assessment
 * Date: 2020-08-09
 * */

public class Main {

    public static void main(String[] a) {
        menu();
    }

    public static void menu() {
        //display menu
        Player player = new Player();
        player.displayYourBoard();
        System.out.println("hello, welcome to battleship. This is a game created for Xerris assessment.");
        System.out.println();
        System.out.println("first round, place your ship");

        //create ship for two players
        Judgement judgement = new Judgement();
        Player player1, player2 = null;
        System.out.println("player1: ");
        while (true) {
            try {
                player1 = userShip();
                player1.displayYourBoard();
                break;
            } catch (Exception e) {
                //make sure ship is in the ocean
                System.out.println("Wrong position to place. Try to place your ship other position.");
            }
        }

        System.out.println("player2: ");
        while (true) {
            try {
                player2 = userShip();

                //check if initial placement conflict
                //if there is conflict, restart the game out of fairness
                if (judgement.placementConflict(player1, player2)) {
                    System.out.println();
                    System.out.println("You both choose the same position");
                    System.out.println("Please restart the game.");
                    System.exit(0);
                }

                player2.displayYourBoard();
                break;
            } catch (Exception e) {
                //make sure ship is in the ocean
                System.out.println("Wrong position to place. Try to place your ship other position.");
            }
        }

        //play the game
        judgement.gamePlay(player1, player2);

    }

    public static Player userShip() {

        Player playerX = new Player();
        Scanner scanner = new Scanner(System.in);

        int row, column, direction;
        System.out.print("please enter your initial row coordinator ");
        row = scanner.nextInt() - 1;
        System.out.print("please enter your initial column coordinator ");
        column = scanner.nextInt() - 1;
        System.out.print("please choose direction: 1.vertical  2.horizontal ");
        direction = scanner.nextInt();

        playerX.createShip(row, column, direction);
        return playerX;
    }

}

