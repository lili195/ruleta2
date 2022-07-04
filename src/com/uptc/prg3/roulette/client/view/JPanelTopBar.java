package com.uptc.prg3.roulette.client.view;

import com.uptc.prg3.roulette.client.controllers.RunnerClient;

import javax.swing.*;
import java.awt.*;

public class JPanelTopBar extends JPanel {
    private JButton rankingBtn, infoBtn, exitBtn;
    private JPanel leftSide, middle, rightSide;
    private JLabel rouletteLbl, timeLbl, timeScore;

    public JPanelTopBar() {
        super();
        this.setLayout(new FlowLayout());
        this.rankingBtn = new JButton();
        this.infoBtn = new JButton();
        this.exitBtn = new JButton();
        this.leftSide = new JPanel();
        this.rouletteLbl = new JLabel();
        this.timeLbl = new JLabel();
        this.timeScore = new JLabel();
        this.middle = new JPanel();
        this.rightSide = new JPanel();
        initComponents();
    }

    private void initComponents() {
        rankingBtn.setText(Constants.RANKIN_BTN_TEXT);
        infoBtn.setText(Constants.INFO_BTN_TEXT);

        leftSide.setLayout(new FlowLayout());
        leftSide.add(rankingBtn);
        leftSide.add(infoBtn);
        this.add(leftSide);

        rouletteLbl.setText(Constants.MAIN_TITTLE_TEXT);
        timeLbl.setText(Constants.TIME_TITTLE_TEXT);
        timeScore.setText("" + RunnerClient.TIME_SLEEP_INTERVAL);
        middle.setLayout(new FlowLayout(FlowLayout.CENTER));
        middle.add(rouletteLbl);
        middle.add(timeLbl);
        middle.add(this.timeScore);
        this.add(middle);

        exitBtn.setText(Constants.EXIT_BTN_TEXT);
        rightSide.setLayout(new FlowLayout());
        rightSide.add(exitBtn);
        this.add(rightSide);
    }

    protected void setTimeScore(int timeScore) {
        this.timeScore.setText("" + timeScore);
        this.timeScore.updateUI();
    }
}
