package mx.com.angeldev.marveljar.model;

import java.util.Date;

public class Character {
	
	private int id;
	private String name;
	private String description;
	private Date modified;
	private String resourceURI;
	private Url[] urls;
	private Image thumbnail;
	private ComicList comics;
	private StoryList stories;
	private EventList events;
	private SeriesList series;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public String getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	public Url[] getUrls() {
		return urls;
	}
	public void setUrls(Url[] urls) {
		this.urls = urls;
	}
	public Image getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(Image thumbnail) {
		this.thumbnail = thumbnail;
	}
	public ComicList getComics() {
		return comics;
	}
	public void setComics(ComicList comics) {
		this.comics = comics;
	}
	public StoryList getStories() {
		return stories;
	}
	public void setStories(StoryList stories) {
		this.stories = stories;
	}
	public EventList getEvents() {
		return events;
	}
	public void setEvents(EventList events) {
		this.events = events;
	}
	public SeriesList getSeries() {
		return series;
	}
	public void setSeries(SeriesList series) {
		this.series = series;
	}
	
}
