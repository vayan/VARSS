package com.vayan.rss;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by yann on 23/11/2014.
 */
public class Gui extends JFrame {
    private JList rssFeeds;
    private JTextArea oneRssContent;
    private JPanel MainUI;
    private JButton ExitButton;

    public Gui() {
        setTitle("VARRSS");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(this.MainUI);
        setVisible(true);

        ExitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(11);
            }
        });
    }
    
}
