package com.uptc.prg3.roulette.server.models;

import java.util.Random;

import com.uptc.prg3.roulette.server.dataStructure.SimpleCirularList;

public class Roulette <T> extends SimpleCirularList <T> implements Runnable {
    private static final long REFRESH_TIME = 10;
    private double speed;
    private Random random;
    private boolean running; //flag

    public Roulette(double speed) {
        super();
        this.random = new Random();
        this.speed = speed;
        this.running = false;
    }

    public Roulette() {

    }

    public void start() {
        new Thread(this).start();
    }
    @Override
    public void run() {
        while (!this.running) {
            try {
                Thread.sleep(REFRESH_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (speed > 0) {
            this.next();
            try {
                Thread.sleep((long) (1000/speed));
                //disminuir velocidad -> al azar
                speed -= this.random.nextDouble() * 0.5;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.running = false;  
    }

    public boolean isRunning() {
        return this.running;
    }

    public void setRunning(boolean value) {
        this.running = value;
    }

    public void initPosition() {
        for (int i = 0; i < random.nextInt(100); i++) {
            this.next();
        }
    }

    @Override
    public String toString() {
        return "Roulette{" +
                "speed=" + speed +
                ", random=" + random +
                ", running=" + running +
                '}';
    }
}
