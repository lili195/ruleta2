package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;

public class JPanelCenterEast extends JPanel {
    private JLabel bet, earnings,earningResult;
    private JComboBox betOption;
    private String[] betOptions = { Constants.FIRST_POINT_OP,
                                    Constants.SECOND_POINT_OP,
                                    Constants.THIRD_POINT_OP,
                                    Constants.FOURTH_POINT_OP,
                                    Constants.FIFTH_POINT_OP};
    private JPanel top, bottom, earningsPanel;

    public JPanelCenterEast() {
        this.bet = new JLabel();
        this.betOption = new JComboBox(this.betOptions);
        this.earnings = new JLabel();
        this.earningResult = new JLabel("xxxx");
        this.top = new JPanel();
        this.bottom = new JPanel();
        this.earningsPanel = new JPanel();
        init();
    }
    private void init() {
        this.setPreferredSize(new Dimension(150,200));
        this.setLayout(null);
        bet.setText(Constants.BET_TEXT);
        top.setBounds(25,10,100,50);
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(bet);
        top.add(betOption);

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

    protected double getBet() {
        return Double.parseDouble(this.betOptions[this.betOption.getSelectedIndex()]);
    }

    public void setEarningsText(String earnings) {
        this.earningResult.setText(earnings);
    }
}
