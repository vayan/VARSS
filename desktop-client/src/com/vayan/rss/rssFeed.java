package com.vayan.rss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 23/11/2014.
 */
public class rssFeed implements Visitor {
    private String name;
    private String url;
    private List<rssItem> rssItems;

    public rssFeed(String name, String url) {
        this.name = name;
        this.url = url;
        this.rssItems = new ArrayList<rssItem>();
    }

    public List<rssItem> getRssItems() {
        return rssItems;
    }

    public void addItem(rssItem it) {
        rssItems.add(it);
    }

    public String getName() {
        return name;
    }

    @Override
    public Object getData() {
        return rssItems;
    }

    @Override
    public Object getOneData(int index) {
        return rssItems.get(index);
    }

    @Override
    public int getSize() {
        return rssItems.size();
    }

    @Override
    public int getIndexofChild(Object o) {
        return rssItems.indexOf(o);
    }
}
