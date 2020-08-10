package battleship;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @org.junit.jupiter.api.Test
    void getShip() {
        String[][] test = new String[8][8];
        test[1][1] = "x";
        Ship ship = new Ship(test);
        assertEquals("x",ship.getShip()[1][1]);
    }

    @org.junit.jupiter.api.Test
    void setShip() {
        String[][] test = new String[8][8];
        test[1][1] = "x";
        Ship ship = new Ship();
        ship.setShip(test);
        assertEquals(test[1][1],ship.getShip()[1][1]);
    }
}