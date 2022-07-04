package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelCenter extends JPanel {
    private JPanelCenterEast centerEast;
    private JPanelCenterWest centerWest;

    public JPanelCenter() {
        this.centerEast = new JPanelCenterEast();
        this.centerWest = new JPanelCenterWest();
        init();
    }

    private void init() {
        this.setLayout(null);
        this.centerWest.setBounds(10,10,600,220);
        this.centerEast.setBounds(630,15,150,200);
        this.add(centerEast);
        this.add(centerWest);
    }

//    protected double getBet() {
//        return this.centerEast.getBet();
//    }
}
