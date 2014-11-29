package com.satyre.vayarss;


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

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return getName();
    }
}