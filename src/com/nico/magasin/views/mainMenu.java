package com.nico.magasin.views;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JMenuBar {

    private String st_apropos = "créé par nicolas vidaud pour les musiques de l'armée de terre";

    public mainMenu(){
        super();
        initMenus();
    }

    private void initMenus(){
        JMenu help= new JMenu("aide");
        JMenuItem aPropos = new JMenuItem("a propos");
        aPropos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(null,st_apropos,"a propos",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        help.add(aPropos);
        this.add(help);
    }
}
