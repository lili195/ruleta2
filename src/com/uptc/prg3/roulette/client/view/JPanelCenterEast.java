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
    private JPanel top, bottom;

    public JPanelCenterEast() {
        this.bet = new JLabel();
        this.betOption = new JComboBox(this.betOptions);
        this.earnings = new JLabel();
        this.earningResult = new JLabel();
        this.top = new JPanel();
        this.bottom = new JPanel();
        init();
    }
    private void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new BorderLayout());
        bet.setText(Constants.BET_TEXT);
        earnings.setText(Constants.EARNINGS_TEXT);
        top.setLayout(new BorderLayout());
        top.add(bet, BorderLayout.NORTH);
        top.add(betOption, BorderLayout.SOUTH);

        this.add(top, BorderLayout.NORTH);
    }

    public void setEarnings(String earnings) {
        this.earningResult.setText(earnings);
    }
}
