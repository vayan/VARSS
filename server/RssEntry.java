import java.utils.*;

public class RssEntry
{
    private Date		date;		// Date of publication, contains a long with the date in Miliseconds (Epoch/Unix Time)
    private boolean		read;		// Status, read or not
    private String		title;		// Headline
    private String		content;	// HTML content of the item
    private String		link;		// Link of the item

    public String		getTitle()			{ return title; }
    public void			setTitle(String newTitle)	{ title = newTitle; }
    public String		getContent()			{ return content; }
    public void			setContent(String newContent)	{ content = newContent; }
    public String		getLink()			{ return title; }
    public void			setLink(String newTitle)	{ title = newTitle; }
    public boolean		getRead()			{ return read; }
    public void			setRead(boolean newRead)	{ read = newRead; }
    public void			toggleRead()			{ read = !read; }
    public long			getDate()			{ return date.getTime(); }
    public String		getDateString()			{ return date.toString(); }
    public void			setDate(long newDate)		{ date.setTime(newDate) }

    public RssEntry((String newTitle, String newLink, String newContent, long newDate)
    {
	title = newTitle;
	link = newLink;
	content = newContent;
	date = new Date(newDate);
    }
}
