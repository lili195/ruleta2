package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JWindowMain extends JWindow {
    private JPanelTopBar topBar;
    private JPanelCenterWest centerWest;
    private JPanelCenterEast centerEast;

    /*public JWindowMain(int size) {
        super();
        this.playButton = new JButton();
        this.rouletteSetPanel = new JPanelRouletteSet(size);
        this.init();
    }*/

    public JWindowMain (int size) {
        super();
        this.topBar = new JPanelTopBar();
        this.centerWest = new JPanelCenterWest(size);
        this.centerEast = new JPanelCenterEast();
        init();
    }
    private void init() {
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(topBar, BorderLayout.NORTH);
        this.add(centerWest, BorderLayout.CENTER);
        this.add(centerEast, BorderLayout.EAST);

        this.setVisible(true);
/*
        this.playButton.setText("START");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(playButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        JPanel roulettePanel = new JPanel();
        //roulettePanel.setLayout(null);
        roulettePanel.setBounds(100, 100, 200, 200);
        roulettePanel.add(rouletteSetPanel);
        this.add(roulettePanel, BorderLayout.CENTER);
        this.setVisible(true);*/
    }
}
