package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JWindowMain extends JWindow {
    private JPanelTopBar topBar;
    private JPanelCenter center;
    private JPanelSouth south;

    public JWindowMain () {
        super();
        this.topBar = new JPanelTopBar();
        this.center = new JPanelCenter();
        this.south = new JPanelSouth();

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

    public double getBet() {
        return this.center.getBet();
    }

    public void setTimeScore(int timeScore) {
        this.topBar.setTimeScore(timeScore);
    }
}
