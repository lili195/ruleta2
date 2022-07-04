package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelChosenBet extends JPanel {
    private JLabel firstBet, secondBet, thirdBet;
    private ImageIcon img;
    public JPanelChosenBet() {
        super();
        this.firstBet = new JLabel();
        this.secondBet = new JLabel();
        this.thirdBet = new JLabel();
    }

    private void init() {
//        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(null);
        firstBet.setBounds(10,20,50,50);
        firstBet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(firstBet);
        this.add(secondBet);
        this.add(thirdBet);
    }

    public ImageIcon setBets(String path) {
        return this.img = new ImageIcon(path);
    }

    public void setFirstBet(String path) {
        this.firstBet.setIcon(setBets(path));
    }
    public void setSecondBet(String path) {
        this.secondBet.setIcon(setBets(path));
    }
    public void setThirdBet(String path) {
        this.thirdBet.setIcon(setBets(path));
    }
}
