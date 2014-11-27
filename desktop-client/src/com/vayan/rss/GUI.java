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

        rssFeed feed2 = new rssFeed("vayan", "http://vayan.fr");
        rssItem item11 = new rssItem(" la maison", "parce que cest comme ca ");
        rssItem item22 = new rssItem("la boufe", "parce que cest comme ca ");
        rssItem item33 = new rssItem("la canard", "parce que cest comme ca ");
        rssItem item44 = new rssItem("la foo", "parce que cest comme ca ");
        rssItem item55 = new rssItem("la dance", "parce que cest comme ca ");
        feed2.addItem(item11);
        feed2.addItem(item22);
        feed2.addItem(item33);
        feed2.addItem(item44);
        feed2.addItem(item55);

        feedslist.addFeed(feed1);
        feedslist.addFeed(feed2);

        rssTree.setModel(feedslist);
        rssTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        rssTree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                Object nodeInfo = rssTree.getLastSelectedPathComponent();
                System.out.println(nodeInfo.getClass().getName());

            }
        });


        ExitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(11);
            }
        });
    }
    
}
