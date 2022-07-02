package view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class JPanelRouletteSet extends JPanel {
    private JPanelRoulette[] rPanels;

    public JPanelRouletteSet(int size) {
        super();
        this.rPanels = new JPanelRoulette[size];
        for (int i = 0; i < size; i++) {
            rPanels[i] = new JPanelRoulette();
        }
        init();
    }

    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(200*this.rPanels.length,200));
        this.setLayout(new GridLayout(1,this.rPanels.length, 20, 20));
        for (JPanelRoulette jPanelRoulette : rPanels) {
            this.add(jPanelRoulette);
        }
    }
}
