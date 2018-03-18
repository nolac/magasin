package com.nico.magasin.views;

import javax.swing.*;
import java.awt.*;

public class Main_window extends JFrame {

    Main_window(){
        this.setTitle("gestion magasin instrument");
        this.setSize(new Dimension(1000,600));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(new mainMenu());
        this.setContentPane(new Building());
        this.setVisible(true);
    }

    private void initMenu(){

    }

    public static void main(String[] args){
        new Main_window();
    }
}
