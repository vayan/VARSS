import java.utils.*;

public class RssFeed
{
    private String		title;		// Title of the Website
    private String		link;		// URL of the RSS Feed
    private String		website;	// Original website
    private String		author;		// Webmaster

    private ArrayList<RssEntry>	items;		// Items actually

    public String		getTitle()			{ return title; }
    public void			setTitle(String newTitle)	{ title = newTitle; }
    public String		getLink()			{ return title; }
    public void			setLink(String newTitle)	{ title = newTitle; }
    public String		getAuthor()			{ return title; }
    public void			setTitle(String newTitle)	{ title = newTitle; }
    public String		getAuthor()			{ return title; }
    public void			setTitle(String newTitle)	{ title = newTitle; }

    public ArrayList<RssEntry>	getItems()			{ return items.clone(); }
    public int			getNbrItems()			{ return items.size(); }
    public RssEntry		getLastItem()			{ return items.get(items.size() -1); }
    public RssEntry		getItem(int index)		{ return items.get(index); }
    public void			flushItems()			{ items.clear(); }	    
    public void			addItem(RssEntry newItem)	{ items.add(newFeed); }

    
    
    public RssFeed(String newTitle, String newLink, String newWebsite, String newAuthor)
    {
	title = newTitle;
	link = newLink;
	website = newWebsite;
	author = newAuthor;
	feeds = new ArrayList<RssEntry>();
    }

}
