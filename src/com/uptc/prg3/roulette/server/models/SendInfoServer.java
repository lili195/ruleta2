package com.uptc.prg3.roulette.server.models;

import com.uptc.prg3.roulette.server.models.RouletteSet;

import java.io.Serializable;

public class SendInfoServer implements Serializable {

    private Roulette[] roulettes;
    private double score;

    public Roulette[] getRoulettes() {
        return roulettes;
    }

    public void setRoulettes(Roulette[] roulettes) {
        this.roulettes = roulettes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
