package battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void createShip() {
        Player player = new Player();
        player.createShip(1,1,1);
        assertEquals("x",player.board.getBoard()[2][1]);
        assertEquals("x",player.ship.getShip()[2][1]);
    }

    @Test
    void displayYourBoard() {

    }
}