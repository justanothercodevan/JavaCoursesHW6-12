package by.epam.hw8;

public class Item {
	private String name;
	private int sku;
	private int price;
	
	public Item(String name, int sku, int price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getSku() {
		return sku;
	}

	public int getPrice() {
		return price;
	}

}
