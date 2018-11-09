package by.epam.hw9to12;

public class ProgrammerBook extends Book{
	private String programmingLanguage;
	
	public ProgrammerBook(String title, int yearPublished, int price, String programmingLanguage) {
		super(title, yearPublished, price);
		this.programmingLanguage = programmingLanguage;
	}
}
