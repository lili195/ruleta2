package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JWindowMain extends JWindow {
    private JPanelTopBar topBar;
    private JPanelCenter center;

    public JWindowMain (int size) {
        super();
        this.topBar = new JPanelTopBar();
        this.center = new JPanelCenter(size);
        init();
    }
    private void init() {
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(20,20));
        this.add(topBar, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
