package com.vayan.rss;

import javax.swing.*;

/**
 * Created by yann on 28/11/2014.
 */
public class rssContentView {
    private JTextArea oneRssContent;

    public rssContentView(JTextArea oneRssContent) {
        this.oneRssContent = oneRssContent;
    }

    public void setContent(String content) {
        oneRssContent.setText(content);
    }
}
