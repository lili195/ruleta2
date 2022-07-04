package com.uptc.prg3.roulette.server.models;

import java.util.Arrays;

public class RouletteSet <T> {
    private Roulette<T>[] roulettes;

    public RouletteSet() {
    }

    public RouletteSet(Roulette<T>[] roulettes) {
        this.roulettes = roulettes;
    }

    public Roulette<T>[] getRoulettes() {
        return roulettes;
    }

    public double getScore() {
        return 0;
    }

    public void start() {
        for (Roulette<T> roulette : this.roulettes) {
            roulette.start();
            roulette.initPosition();
        }
    }

    public void play() {
        for (Roulette<T> roulette : roulettes) {
            roulette.setRunning(true);
        }
    }

    public void loadOptions(T[] imgs) {
        for (Roulette<T> roulette : this.roulettes) {
            for (T img : imgs) {
                roulette.insert(img);
            }
        }
    }

    @Override
    public String toString() {
        return "RouletteSet{" +
                "roulettes=" + Arrays.toString(roulettes) +
                '}';
    }
}
