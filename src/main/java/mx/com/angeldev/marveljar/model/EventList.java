package mx.com.angeldev.marveljar.model;

public class EventList {
	
	private int available;
	private int returned;
	private String collectionURI;
	private EventSummary[] items;
	
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	public String getCollectionURI() {
		return collectionURI;
	}
	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}
	public EventSummary[] getItems() {
		return items;
	}
	public void setItems(EventSummary[] items) {
		this.items = items;
	}

}
