package com.uptc.prg3.roulette.server.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InfoServer {

    public static final int PORT = 11111;

    public static String getIpAddressServer() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
