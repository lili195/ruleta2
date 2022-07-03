package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelSouth extends JPanel {
    private JPanelSouthEast southEast;
    private JPanelSouthWest southWest;

    public JPanelSouth() {
        this.southEast = new JPanelSouthEast();
        this.southWest = new JPanelSouthWest();
        init();
    }

    private void init() {
        this.setPreferredSize(new Dimension(600,200));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new BorderLayout());
        this.add(southEast, BorderLayout.EAST);
        this.add(southWest, BorderLayout.WEST);
    }
}
