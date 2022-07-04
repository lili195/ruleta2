package com.uptc.prg3.roulette.client.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelRoulette extends JPanel {
    private JLabel pic;
    private Timer tm;
    private ImageIcon[] images;
    private ImageIcon icon, newImc;
    private Image img, newImg;
    private JPanel slidesShow;
    private String[] imagesPath = { Constants.PATH_IMG1,
                                    Constants.PATH_IMG2,
                                    Constants.PATH_IMG3,
                                    Constants.PATH_IMG4,
                                    Constants.PATH_IMG5,
                                    Constants.PATH_IMG6,
                                    Constants.PATH_IMG7,
                                    Constants.PATH_IMG8,
                                    Constants.PATH_IMG9};
    
    public JPanelRoulette() {
        super();
        setImageSize(8);
        init();
    }

    private void init() {
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.slidesShow = new JPanel(new FlowLayout());
        slidesShow.setBackground(Color.WHITE);
        tm = new Timer(1000,new ActionListener() {
            int x = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                setImageSize(x);
                x += 1;
                if(x >= imagesPath.length)
                    x = 0;
            }
        });
        slidesShow.add(pic);
        this.add(slidesShow);
    }

    public void setImageSize(int i) {
        icon = new ImageIcon(imagesPath[i]);
        img = icon.getImage();
        newImg = img.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        newImc = new ImageIcon(newImg);
        pic = new JLabel();
        pic.setIcon(newImc);
    }


}
