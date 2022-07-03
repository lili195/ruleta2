package model;

import java.util.ArrayList;
import java.util.Iterator;

import persistence.FileScores;

public class BestPlayers {

	private FileScores fileScores;

	public BestPlayers() {
		this.fileScores = new FileScores();
	}

	public void writeScore(Score score) throws ClassNotFoundException {
		ArrayList<Score> scores = this.fileScores.getScores();
		ArrayList<Score> tempScores = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			if (scores.get(i).getPoints() < score.getPoints()) {
				tempScores.add(score);
				tempScores.add(scores.get(i));
				for (int j = i + 1; j < 5; j++) {
					tempScores.add(scores.get(j));
				}
				break;
			} else {
				tempScores.add(scores.get(i));
			}
		}
		scores.clear();
		for (int i = 0; i < 5; i++) {
			scores.add(tempScores.get(i));
		}
		this.fileScores.writeScores(scores);
	}

	public ArrayList<Score> getScores() throws ClassNotFoundException {
		return this.fileScores.getScores();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Score best = new Score("William", 200);
		BestPlayers bests = new BestPlayers();
		bests.writeScore(best);
		System.out.println(bests.getScores());
	}

}
