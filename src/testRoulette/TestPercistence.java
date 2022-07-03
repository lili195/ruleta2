package testRoulette;

import com.uptc.prg3.roulette.server.models.Score;
import com.uptc.prg3.roulette.server.persistence.BestPlayers;

public class TestPercistence {

    public static void main(String[] args) throws ClassNotFoundException {
        Score best = new Score("William", 200);
        BestPlayers bests = new BestPlayers();
        bests.writeScore(best);
        System.out.println(bests.getScores());
    }
}
