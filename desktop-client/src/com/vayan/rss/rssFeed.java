package com.vayan.rss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yann on 23/11/2014.
 */
public class rssFeed {
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

    public rssItem getItem(int index) {
        return rssItems.get(index);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }

}
