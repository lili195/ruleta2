package com.uptc.prg3.roulette.server.persistence;

import java.util.ArrayList;
import com.uptc.prg3.roulette.server.models.Score;

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
}
