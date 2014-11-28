package com.vayan.rss;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
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

        rssContentView contentView = new rssContentView(oneRssContent);
        feedsListView feedslist = new feedsListView(rssTree, contentView);


        rssFeed feed1 = new rssFeed("google", "http://google.fr");
        rssItem item1 = new rssItem("vive la maison", "foo bar foo");
        rssItem item2 = new rssItem("vive la boufe", "sadsdasd ");
        rssItem item3 = new rssItem("vive la canard", "fgdgdfggdf ");
        rssItem item4 = new rssItem("vive la foo", "ewrewrewr ");
        rssItem item5 = new rssItem("vive la dance", "cvbcvbcbcvbcvb ");
        feed1.addItem(item1);
        feed1.addItem(item2);
        feed1.addItem(item3);
        feed1.addItem(item4);
        feed1.addItem(item5);

        rssFeed feed2 = new rssFeed("vayan", "http://vayan.fr");
        rssItem item11 = new rssItem(" la maison", "fdgdfgdfdfga ");
        rssItem item22 = new rssItem("la boufe", "ret <strong>test</strong> ertrterteerter");
        rssItem item33 = new rssItem("la canard", "kjjkkjhjkhjhkhkjkjhkjhkjh ");
        rssItem item44 = new rssItem("la foo", "vbvbvbvbvbe ca ");
        rssItem item55 = new rssItem("la dance", "wwwwwwwwwwwe ca ");
        feed2.addItem(item11);
        feed2.addItem(item22);
        feed2.addItem(item33);
        feed2.addItem(item44);
        feed2.addItem(item55);

        feedslist.addFeed(feed1);
        feedslist.addFeed(feed2);

        ExitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(11);
            }
        });
    }
    
}
