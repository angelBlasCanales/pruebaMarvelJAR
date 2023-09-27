package mx.com.angeldev.marveljar.model;

public class StoryList {
	
	private int available;
	private int returned;
	private String collectionURI;
	private StorySummary[] items;
	
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
	public StorySummary[] getItems() {
		return items;
	}
	public void setItems(StorySummary[] items) {
		this.items = items;
	}

}
