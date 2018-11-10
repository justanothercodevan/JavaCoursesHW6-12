package by.epam.hw9to12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
	
	public List <PrintingEdition> findByTitle(String title) {
		List <PrintingEdition> findings = new ArrayList<PrintingEdition> ();
		for (int i = 0; i < this.editions.size(); i++) {
			if (this.editions.get(i).getTitle() == title) {
				findings.add(this.editions.get(i));
			}
		}
		return findings;
	}
	
	public TreeSet <PrintingEdition> findByAuthor(String author) {
		TreeSet <PrintingEdition> set = new TreeSet<>();
		for (int i = 0; i < this.editions.size(); i++) {
			if (this.editions.get(i) instanceof Book) {
				if (((Book)this.editions.get(i)).getAuthor() == author) {
					set.add(this.editions.get(i));
				}
			}
		}
		return set;
	}
	
	public void printList(List <PrintingEdition> list ) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
	}
	
	public void printTable(List <PrintingEdition> list ) {
		System.out.println("Title\t\tYear\t\tPrice\t");
		System.out.println("--------------------------------------");
		for (int i = 0; i < list.size(); i++) {			
			System.out.println(list.get(i).getTitle() + "\t" +  list.get(i).getYearPublished() + "\t\t" + list.get(i).getPrice());
		}
	}
	
	public void readFromFile(String fileName) throws IOException {
		FileReader fr = new FileReader (fileName);
		Scanner scan = new Scanner(fr);
		while (scan.hasNextLine()) {
			String [] mas = scan.nextLine().split(",");
			addEdition(new PrintingEdition(mas[0], Integer.parseInt(mas[1]), Integer.parseInt(mas[2])));
		}
		fr.close();
	}
	
}
