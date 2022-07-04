package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JWindowMain extends JWindow {
    private JPanelTopBar topBar;
    private JPanelCenter center;
    private JPanelSouth south;

    public JWindowMain (ActionListener l) {
        super();
        this.topBar = new JPanelTopBar(l);
        this.center = new JPanelCenter(l);
        this.south = new JPanelSouth(l);

        init();
    }
    private void init() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.topBar.setBounds(10,10,800,50);
        this.center.setBounds(10,70,800,220);
        this.south.setBounds(10,330,780,220);
        this.add(topBar);
        this.add(center);
        this.add(south);

        this.setVisible(true);
    }

//    public double getBet() {
//        return this.center.getBet();
//    }

    public void setTimeScore(int timeScore) {
        this.topBar.setTimeScore(timeScore);
    }

    public void startRoulettes(boolean b) {
        center.startRoulettes(b);
    }

    public String getSelectedSlot() {
        return south.getSelectedSlot();
    }

    public void updatePic(String name) {
        south.updatePic(name);
    }
}
