package com.uptc.prg3.roulette.server.controllers;

import com.uptc.prg3.roulette.client.models.SendInfoClient;
import com.uptc.prg3.roulette.server.models.RouletteSet;
import com.uptc.prg3.roulette.server.models.SendInfoServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadSocket implements Runnable {

    private Socket socket;

    public ThreadSocket(Socket socket) {
        this.socket = socket;
    }

    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            SendInfoServer sendInfoServer = new SendInfoServer();
            SendInfoClient sendInfoClient = new SendInfoClient();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(this.socket.getInputStream());
            while (true) {
                //sendInfoServer.setRoulettes(informacion de las ruletas);
                //sendInfoServer.setScore(puntaje que lleva);
                objectOutputStream.writeObject(sendInfoServer);
                sendInfoClient = (SendInfoClient) objectInputStream.readObject();
                System.out.println(sendInfoClient.getScore());
                System.out.println(sendInfoClient.getBet());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
