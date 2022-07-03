package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelSouthEast extends JPanel {
    private JPanelChosenBet chosenBet;

    public JPanelSouthEast () {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.chosenBet = new JPanelChosenBet();
    }
}
