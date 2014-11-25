package com.vayan.rss;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 25/11/2014.
 */
public class feedsListView implements TreeModel, Visitor {
    private List<rssFeed> rssFeedList;
    private String name;

    public feedsListView() {
        rssFeedList = new ArrayList<rssFeed>();
        name = "My rsss";
    }

    public String getName() {
        return name;
    }

    @Override
    public Object getData() {
        return rssFeedList;
    }

    @Override
    public Object getOneData(int index) {
        return rssFeedList.get(index);
    }

    @Override
    public int getSize() {
        return rssFeedList.size();
    }

    @Override
    public int getIndexofChild(Object o) {
        return rssFeedList.indexOf(o);
    }

    public void addFeed(rssFeed f) {
        rssFeedList.add(f);
    }

    @Override
    public Object getRoot() {
        return name;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return ((Visitor)parent).getOneData(index);
    }

    @Override
    public int getChildCount(Object parent) {
        return ((Visitor)parent).getSize();
    }

    @Override
    public boolean isLeaf(Object node) {
        return (node instanceof rssItem);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return ((Visitor)parent).getIndexofChild(child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {

    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {

    }
}
