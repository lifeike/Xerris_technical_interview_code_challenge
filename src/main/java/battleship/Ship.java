package battleship;

/*
 * Author: Feike Li (feeco)
 * Title: Xerris battleship assessment
 * Date: 2020-08-09
 * */

public class Ship {

    String[][] ship = new String[8][8];

    public String[][] getShip() {
        return ship;
    }

    public void setShip(String[][] ship) {
        this.ship = ship;
    }
}
