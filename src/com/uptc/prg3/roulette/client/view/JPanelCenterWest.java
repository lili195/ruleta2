package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelCenterWest extends JPanel {
    private JPanelRouletteSet rouletteSet;

    public JPanelCenterWest (int size) {
        this.rouletteSet = new JPanelRouletteSet(size);
        init();
    }

    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new FlowLayout());
        this.add(rouletteSet);
    }

}
