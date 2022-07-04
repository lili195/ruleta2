package com.uptc.prg3.roulette.server.persistence;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import com.google.gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.uptc.prg3.roulette.server.models.Score;


public class FileScores {

	private static final String ROUTE_FILE = "./resources/scores.sp";
	private Gson gson;
	private RandomAccessFile file;

	public FileScores() {
		this.gson = new Gson();
		this.validateFile();
	}

	private void validateFile() {
		File fileSocores = new File(ROUTE_FILE);
		try {
			this.file = new RandomAccessFile(fileSocores, "rw");
			if (fileSocores.length() == 0) {
				this.file.writeBytes(ScoresToJson(getDefault()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Score> getScores() throws ClassNotFoundException {
		Gson gson = new Gson();
		ArrayList<Score> scores = new ArrayList<>();
		try {
			this.file.seek(0);	
			scores = gson.fromJson(this.file.readLine(), new TypeToken<ArrayList<Score>>() {
			}.getType());
			System.out.println(scores.get(0).toString());
		} catch (JsonSyntaxException | IOException e) {
			e.printStackTrace();
		}
		return scores;
	}

	public void writeScores(ArrayList<Score> scores) {
		if (scores.size() == 5) {
			String data = ScoresToJson(scores);
			try {
				this.file.seek(0);
				this.file.writeBytes(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String ScoresToJson(ArrayList<Score> scores) {
		return this.gson.toJson(scores);
	}

	private ArrayList<Score> getDefault() {
		ArrayList<Score> defaults = new ArrayList<Score>();
		for (int i = 0; i < 5; i++) {
			defaults.add(new Score());
		}
		return defaults;
	}

}
