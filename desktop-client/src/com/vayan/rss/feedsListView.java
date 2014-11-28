package com.vayan.rss;

import javax.swing.*;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 25/11/2014.
 */
public class feedsListView implements TreeModel {
    private List<rssFeed> rssFeedList;
    private String name;
    private JTree tree;
    private rssContentView contentView;

    public feedsListView(JTree t, rssContentView contentView) {
        rssFeedList = new ArrayList<rssFeed>();
        name = "My rss";
        this.contentView = contentView;
        tree = t;

        tree.setModel(this);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                if (tree.getLastSelectedPathComponent() instanceof rssItem)
                    onItemSelection((rssItem) tree.getLastSelectedPathComponent());
            }
        });
    }

    public List<rssFeed> getRssFeedList() {
        return rssFeedList;
    }

    public rssFeed getFeed(int index) {
        return rssFeedList.get(index);
    }

    public String getName() {
        return name;
    }

    public void addFeed(rssFeed f) {
        rssFeedList.add(f);
        tree.updateUI();
    }

    private void onItemSelection(rssItem item) {
        contentView.setContent(item.getContent());
    }

    @Override
    public Object getChild(Object parent, int index) {
        if (parent instanceof rssFeed) return ((rssFeed)parent).getItem(index);
        if (parent instanceof feedsListView) return ((feedsListView)parent).getFeed(index);
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        if (parent instanceof rssFeed) return ((rssFeed)parent).getRssItems().size();
        if (parent instanceof feedsListView) return ((feedsListView)parent).getRssFeedList().size();
        return 0;
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof rssFeed) return ((rssFeed)parent).getRssItems().indexOf(child);
        if (parent instanceof feedsListView) return ((feedsListView)parent).getRssFeedList().indexOf(child);
        return -1;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public Object getRoot() {
        return this;
    }

    @Override
    public boolean isLeaf(Object node) {
        return (node instanceof com.vayan.rss.rssItem);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {

    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {

    }
}
