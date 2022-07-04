package com.uptc.prg3.roulette.client.models;

import java.io.Serializable;

public class SendInfoClient implements Serializable {

    private double bet;
    private double score;

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
