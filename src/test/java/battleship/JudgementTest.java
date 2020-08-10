package battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {

    @Test
    void hitOrMiss() {
        Judgement judgement = new Judgement();
        Player player = new Player();
        player.createShip(1,1,1);
        assertEquals(false,judgement.hitOrMiss(player,4,5));
        assertEquals(true,judgement.hitOrMiss(player,2,1));
    }

    @Test
    void taken() {
        Judgement judgement = new Judgement();
        Player player = new Player();
        String[][] test = new String[8][8];
        test[1][1] = "x";
        player.board.setBoard(test);
        assertEquals(true,judgement.taken(player,1,1));
        assertEquals(false,judgement.taken(player,2,1));
    }

    @Test
    void gamePlay() {

    }

    @Test
    void placementConflict() {
        Judgement judgement = new Judgement();
        Player player1 = new Player();
        Player player2 = new Player();
        player1.createShip(1,1,1);
        player2.createShip(2,2,2);
        assertEquals(true,judgement.placementConflict(player1,player1));
        assertEquals(false,judgement.placementConflict(player1,player2));
    }
}