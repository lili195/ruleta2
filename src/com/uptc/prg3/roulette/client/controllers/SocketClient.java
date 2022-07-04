package com.uptc.prg3.roulette.client.controllers;

import com.uptc.prg3.roulette.client.models.SendInfoClient;
import com.uptc.prg3.roulette.server.controllers.InfoServer;
import com.uptc.prg3.roulette.server.models.RouletteSet;
import com.uptc.prg3.roulette.server.models.SendInfoServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Timer;

public class SocketClient {

    private Socket socket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;
    private SendInfoServer sendInfoServer;
    private SendInfoClient sendInfoClient;

    public SocketClient() {
        init();
    }

    private void init() {
        try {
            this.socket = new Socket(InfoServer.getIpAddressServer(), InfoServer.PORT);
            this.objectInputStream = new ObjectInputStream(this.socket.getInputStream());
            this.objectOutputStream = new ObjectOutputStream(this.socket.getOutputStream());
        }catch (Exception e) {

        }
    }

    public void sendInfo() {
        try {
            this.sendInfoClient = new SendInfoClient();
            this.objectOutputStream.writeObject(this.sendInfoClient);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getInfo() {
        try {
            this.sendInfoServer = (SendInfoServer) this.objectInputStream.readObject();
            System.out.println(this.sendInfoServer.getRoulettes());
            System.out.println(this.sendInfoServer.getScore());
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
