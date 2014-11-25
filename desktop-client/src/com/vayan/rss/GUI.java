package com.vayan.rss;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by yann on 23/11/2014.
 */
public class Gui extends JFrame {
    private JTextArea oneRssContent;
    private JPanel MainUI;
    private JButton ExitButton;
    private JTree rssTree;

    public Gui() {
        setTitle("VARRSS");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(this.MainUI);
        setVisible(true);

        feedsListView feedslist = new feedsListView();


        rssFeed feed1 = new rssFeed("google", "http://google.fr");
        rssItem item1 = new rssItem("vive la maison", "parce que cest comme ca ");
        rssItem item2 = new rssItem("vive la boufe", "parce que cest comme ca ");
        rssItem item3 = new rssItem("vive la canard", "parce que cest comme ca ");
        rssItem item4 = new rssItem("vive la foo", "parce que cest comme ca ");
        rssItem item5 = new rssItem("vive la dance", "parce que cest comme ca ");
        feed1.addItem(item1);
        feed1.addItem(item2);
        feed1.addItem(item3);
        feed1.addItem(item4);
        feed1.addItem(item5);

        feedslist.addFeed(feed1);
        feedslist.addFeed(feed1);

        rssTree.setModel(feedslist);

        ExitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(11);
            }
        });
    }
    
}
