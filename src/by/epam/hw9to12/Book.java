package by.epam.hw9to12;

public class Book extends PrintingEdition {
	private String author;
	
	public String getAuthor() {
		return author;
	}

	public Book (String title, int yearPublished, int price, String author) {
		super(title,yearPublished,price);
		this.author = author;
	}
}
