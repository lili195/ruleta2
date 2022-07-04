package com.uptc.prg3.roulette.client.controllers;

import com.uptc.prg3.roulette.client.view.JWindowMain;

import java.util.Timer;

public class RunnerClient {

    public static final int TIME_SLEEP_INTERVAL = 30;
    private JWindowMain jWindowMain;
    private SocketClient socketClient;

    public RunnerClient() {
        this.jWindowMain = new JWindowMain();
        this.socketClient = new SocketClient();
        init();
    }
    private void init() {
        for (int i = TIME_SLEEP_INTERVAL; i >= 0; i--) {
            try {
                if (i == (TIME_SLEEP_INTERVAL - 1)) {
                    this.socketClient.getInfo();
                }
                this.jWindowMain.setTimeScore(i);
                Thread.sleep(500);
                if (i == 0) {
                    this.socketClient.sendInfo();
                    Thread.sleep(1000);
                    i = TIME_SLEEP_INTERVAL;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new RunnerClient();
    }
}
