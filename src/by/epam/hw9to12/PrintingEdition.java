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
		int anotherYear = obj.getYearPublished();
		
		if (this.price < anotherPrice)
			return -1;
		else if (this.price == anotherPrice) {
			if (this.yearPublished < anotherYear)
				return -1;
			else if (this.yearPublished == anotherYear)
				return 0;
			else
				return 1;
		} else
			return 1;
	}

	
}
