package com.uptc.prg3.roulette.client.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class JPanelRouletteSet extends JPanel {
    private JPanelRoulette[] rPanels;

    public JPanelRouletteSet() {
        super();
        this.rPanels = new JPanelRoulette[Constants.ROULETTE_AMOUNT];
        for (int i = 0; i < Constants.ROULETTE_AMOUNT; i++) {
            rPanels[i] = new JPanelRoulette();
        }
        init();
    }

    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(200*this.rPanels.length,200));
        this.setLayout(new GridLayout(1,this.rPanels.length, 20, 20));
        for (JPanelRoulette jPanelRoulette : rPanels) {
            this.add(jPanelRoulette);
        }
    }
}
