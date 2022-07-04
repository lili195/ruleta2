package com.uptc.prg3.roulette.server.controllers;

import com.uptc.prg3.roulette.server.models.SendInfoServer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public SocketServer() {
        init();
    }

    private void init() {
        try {
            ServerSocket serverSocket = new ServerSocket(InfoServer.PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                new ThreadSocket(socket).start();
            }
        }catch (IOException e) {

        }
    }
}
