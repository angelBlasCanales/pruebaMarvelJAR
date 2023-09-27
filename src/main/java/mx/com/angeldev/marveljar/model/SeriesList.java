package mx.com.angeldev.marveljar.model;

public class SeriesList {
	
	private int available;
	private int returned;
	private String collectionURI;
	private SeriesSummary[] items;
	
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
	public SeriesSummary[] getItems() {
		return items;
	}
	public void setItems(SeriesSummary[] items) {
		this.items = items;
	}
	
}
