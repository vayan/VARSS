package com.vayan.rss;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 25/11/2014.
 */
public class feedsListView implements TreeModel {
    private List<rssFeed> rssFeedList;
    private String name;

    public feedsListView() {
        rssFeedList = new ArrayList<rssFeed>();
        name = "My rss";
    }

    public List<rssFeed> getRssFeedList() {
        return rssFeedList;
    }

    public String getName() {
        return name;
    }

    public void addFeed(rssFeed f) {
        rssFeedList.add(f);
    }

    public rssFeed getFeed(int index) { return rssFeedList.get(index); }



    @Override
    public Object getRoot() {
        return this;
    }

    @Override
    public Object getChild(Object parent, int index) {
        System.out.println("getchild");
        System.out.println((parent.getClass().getName()));
        if (parent.getClass().getName().equals("com.vayan.rss.rssItem")) return ((rssItem)parent).getName();
        if (parent.getClass().getName().equals("com.vayan.rss.rssFeed")) return ((rssFeed)parent).getItem(index);
        if (parent.getClass().getName().equals("com.vayan.rss.feedsListView")) return ((feedsListView)parent).getFeed(index);
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        System.out.println("getChildCount");
        System.out.println((parent.getClass().getName()));
        if (parent.getClass().getName().equals("com.vayan.rss.rssItem")) return 1;
        if (parent.getClass().getName().equals("com.vayan.rss.rssFeed")) return ((rssFeed)parent).getRssItems().size();
        if (parent.getClass().getName().equals("com.vayan.rss.feedsListView")) return ((feedsListView)parent).getRssFeedList().size();
        return 0;
    }

    @Override
    public boolean isLeaf(Object node) {
        return (node instanceof com.vayan.rss.rssItem);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        System.out.println("valueForPathChanged");
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        System.out.println("getIndexOfChild");
        System.out.println((parent.getClass().getName()));
        if (parent.getClass().getName().equals("com.vayan.rss.rssItem")) return 0;
        if (parent.getClass().getName().equals("com.vayan.rss.rssFeed")) return ((rssFeed)parent).getRssItems().indexOf(child);
        if (parent.getClass().getName().equals("com.vayan.rss.feedsListView")) return ((feedsListView)parent).getRssFeedList().indexOf(child);
        return 0;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {

    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {

    }
}
