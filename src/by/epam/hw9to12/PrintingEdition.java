package by.epam.hw9to12;

public class PrintingEdition implements Comparable <PrintingEdition>{
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

	public int getYearPublished() {
		return yearPublished;
	}


	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(PrintingEdition obj) {
		int anotherPrice = obj.getPrice();
		return this.price - anotherPrice;
	}

	
}
