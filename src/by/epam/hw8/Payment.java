package by.epam.hw8;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private List<Item> items = new ArrayList<Item>();
	
	public Payment() {}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public boolean deleteItem(Item item) {
		return items.remove(item);
	}
	
}
