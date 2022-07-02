package model;

import roulette.Roulette;

public class RouletteSet <T> {
    private Roulette<T>[] roulettes;

    public RouletteSet(Roulette<T>[] roulettes) {
        this.roulettes = roulettes;
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
}
