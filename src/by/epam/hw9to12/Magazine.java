package by.epam.hw9to12;

public class Magazine extends PrintingEdition{
	private String topic;
	
	public Magazine (String title, int yearPublished, int price, String topic) {
		super(title, yearPublished, price);
		this.topic = topic;
	}
}
