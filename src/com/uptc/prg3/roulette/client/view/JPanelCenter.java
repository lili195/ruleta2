package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelCenter extends JPanel {
    private JPanelCenterEast centerEast;
    private JPanelCenterWest centerWest;

    public JPanelCenter(int size) {
        this.centerEast = new JPanelCenterEast();
        this.centerWest = new JPanelCenterWest(size);
        init();
    }

    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new BorderLayout(20,20));
        this.add(centerEast, BorderLayout.EAST);
        this.add(centerWest, BorderLayout.WEST);
    }
}
