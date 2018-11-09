package by.epam.hw9to12;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List <PrintingEdition> editions = new ArrayList<PrintingEdition> ();
	
	public void addEdition(PrintingEdition edition) {
		if (edition != null) {
			this.editions.add(edition);
		}		
	}
	
	public void removeEdition(PrintingEdition edition) {
		if (edition != null) {
			this.editions.remove(edition);
		}		
	}
	
	public List <PrintingEdition>  findByTitle(String title) {
		List <PrintingEdition> findings = new ArrayList<PrintingEdition> ();
		for (int i = 0; i < this.editions.size(); i++) {
			if (this.editions.get(i).getTitle() == title) {
				findings.add(this.editions.get(i));
			}
		}
		return null;
	}
	
	public void printList(List <PrintingEdition> list ) {
		for (int i = 0; i < this.editions.size(); i++) {
			System.out.println(this.editions.get(i));
		}
	}
	
}
