package com.satyre.vayarss;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class RSSFeedListActivity extends ActionBarActivity{
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.rss_feed_list);
	        Log.d("RSS", "ca passe");
	        rssFeed feed1 = new rssFeed("google", "http://google.fr");
	        rssItem item1 = new rssItem("vive la maison", "foo bar foo");
	        rssItem item2 = new rssItem("vive la boufe", "sadsdasd ");
	        rssItem item3 = new rssItem("vive la canard", "fgdgdfggdf ");
	        rssItem item4 = new rssItem("vive la foo", "ewrewrewr ");
	        rssItem item5 = new rssItem("vive la dance", "cvbcvbcbcvbcvb ");
	        feed1.addItem(item1);
	        feed1.addItem(item2);
	        feed1.addItem(item3);
	        feed1.addItem(item4);
	        feed1.addItem(item5);

	        rssFeed feed2 = new rssFeed("vayan", "http://vayan.fr");
	        rssItem item11 = new rssItem(" la maison", "fdgdfgdfdfga ");
	        rssItem item22 = new rssItem("la boufe", "ret <strong>test</strong> ertrterteerter");
	        rssItem item33 = new rssItem("la canard", "kjjkkjhjkhjhkhkjkjhkjhkjh ");
	        rssItem item44 = new rssItem("la foo", "vbvbvbvbvbe ca ");
	        rssItem item55 = new rssItem("la dance", "wwwwwwwwwwwe ca ");
	        feed2.addItem(item11);
	        feed2.addItem(item22);
	        feed2.addItem(item33);
	        feed2.addItem(item44);
	        feed2.addItem(item55);
	        
	    }

}