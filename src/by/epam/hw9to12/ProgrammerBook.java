package by.epam.hw9to12;

public class ProgrammerBook extends Book{
	private String programmingLanguage;
	
	public ProgrammerBook(String title, int yearPublished, int price, String author, String programmingLanguage) {
		super(title, yearPublished, price, author);
		this.programmingLanguage = programmingLanguage;
	}
}
