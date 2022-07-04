package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JPanelCenterEast extends JPanel {
    private JLabel bet, earnings,earningResult;
    private JButton startBtn;
    private JPanel top, bottom, earningsPanel;

    public JPanelCenterEast(ActionListener l) {
        this.bet = new JLabel();
        this.startBtn = new JButton();
        this.earnings = new JLabel();
        this.earningResult = new JLabel("xxxx");
        this.top = new JPanel();
        this.bottom = new JPanel();
        this.earningsPanel = new JPanel();
        init(l);
    }
    private void init(ActionListener l) {
        this.setPreferredSize(new Dimension(150,200));
        this.setLayout(null);
        bet.setText(Constants.BET_TEXT);
        startBtn.setText(Constants.PLAY_BTN_TEXT);
        startBtn.addActionListener(l);
        startBtn.setActionCommand(Constants.PLAY_COMMAND);
        top.setBounds(25,10,100,50);
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(bet);
        top.add(startBtn);

        this.add(top);

        earnings.setText(Constants.EARNINGS_TEXT);
        bottom.setBounds(25,110,100,50);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.Y_AXIS));
        bottom.add(earnings);
        earningsPanel.setLayout(new FlowLayout());
        earningsPanel.add(earningResult);
        earningsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bottom.add(earningsPanel);

        this.add(bottom);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void setEarningsText(String earnings) {
        this.earningResult.setText(earnings);
    }
}
