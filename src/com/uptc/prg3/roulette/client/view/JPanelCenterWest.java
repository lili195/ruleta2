package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelCenterWest extends JPanel {
    private JPanelRouletteSet rouletteSet;

    public JPanelCenterWest () {
        this.rouletteSet = new JPanelRouletteSet();
        init();
    }

    private void init() {
        this.setLayout(new FlowLayout());
        this.add(rouletteSet);
    }

}
