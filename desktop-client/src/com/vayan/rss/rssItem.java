package com.vayan.rss;

/**
 * Created by yann on 23/11/2014.
 */
public class rssItem implements Visitor {
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
    public Object getData() {
        return title;
    }

    @Override
    public Object getOneData(int index) {
        return title;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getIndexofChild(Object o) {
        return 0;
    }
}
