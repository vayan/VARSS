package com.vayan.rss;

/**
 * Created by yann on 23/11/2014.
 */
public class rssItem {
    private String title;
    private String content;

    public rssItem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return title;
    }

    @Override
    public String toString() {
        return getName();
    }
}
