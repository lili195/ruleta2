package com.uptc.prg3.roulette.server.models;

public class Score {

	private String name;
	private int points;

	public Score() {
		this.name = "NA";
		this.points = 0;

	}

	public Score(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", points=" + points + "]";
	}
}
