package by.epam.hw9to12;

public class PrintingEdition {
	private String title;
	private int yearPublished;
	private int price;	
	
	public PrintingEdition() {	}
	
	public PrintingEdition(String title, int yearPublished, int price) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
