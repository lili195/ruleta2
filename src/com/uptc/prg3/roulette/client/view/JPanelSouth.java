package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JPanelSouth extends JPanel {
    private JPanelSouthEast southEast;
    private JPanelSouthWest southWest;

    public JPanelSouth(ActionListener l) {
        this.southEast = new JPanelSouthEast(l);
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

    public String getSelectedSlot() {
        return southEast.getSelectedSlot();
    }

    public void updatePic(String name) {
        southEast.updatePic(name);
    }
}
