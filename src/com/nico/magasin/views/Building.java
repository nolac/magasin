package com.nico.magasin.views;

import javax.swing.*;
import java.awt.*;

public class Building extends JPanel {

    private JLabel txt = new JLabel("en construction");

    Building(){
        super();
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.txt.setFont(new Font("Impact",Font.BOLD,45));
        this.txt.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(txt);

    }
}
