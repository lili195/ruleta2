package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JPanelSouthEast extends JPanel {
    private JLabel pic;
    private final JLabel chooseLbl;
    private JComboBox option;
    private final String[] options = {Constants.BANANA_COMBO,
                                Constants.BAR_COMBO,
                                Constants.CHERRIES_COMBO,
                                Constants.DIAMOND_COMBO,
                                Constants.GRAPES_COMBO,
                                Constants.LEMON_COMBO,
                                Constants.LUCK_COMBO,
                                Constants.SEVEN_COMBO,
                                Constants.SINGLE_GRAPE_COMBO,
                                Constants.WATERMELON_COMBO};

    public JPanelSouthEast (ActionListener l) {
        this.chooseLbl = new JLabel();
        this.pic = new JLabel();
        this.setPreferredSize(new Dimension(200,200));
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        init(l);
    }

    public void init(ActionListener l) {
        chooseLbl.setText(Constants.CHOICE_TEXT);
        chooseLbl.setBounds(40,10,200,20);

        option = new JComboBox(options);
        option.setBounds(40,40,100,30);
        option.setSelectedIndex(5);
        option.addActionListener(l);
        option.setActionCommand(Constants.COMBO_COMMAND);

        pic = new JLabel();
        pic.setBounds(40,90,100,100);
        pic.setHorizontalAlignment(JLabel.CENTER);
        updatePic(options[option.getSelectedIndex()]);

        pic.setPreferredSize(new Dimension(170, 170));

        this.add(chooseLbl);
        this.add(option);
        this.add(pic);
    }

    public void updatePic(String name) {
        ImageIcon icon = new ImageIcon("resources/" + "images/" + name.toLowerCase() + ".png");
        pic.setIcon(icon);
        pic.setToolTipText("A drawing of a " + name.toLowerCase());
        pic.setText(null);
    }


    public String getSelectedSlot() {
        String chosen = option.getSelectedItem().toString();
        updatePic(chosen);
        return chosen;
    }
}
