package by.epam.hw9to12;

import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		
		ProgrammerBook pBook = new ProgrammerBook("JAVA Core",2013,20000,"Java");
		ProgrammerBook pBook2 = new ProgrammerBook("Python for dummies",2009,21000,"Python");
		Magazine mag = new Magazine("National geografic",2012,2000,"Nature");		
		
		lib.addEdition(pBook);
		lib.addEdition(pBook2);
		lib.addEdition(mag);
		
		List<PrintingEdition> find = lib.findByTitle("JAVA Core");
		lib.printList(find);
		lib.printTable(find);
		
		
		TreeSet <PrintingEdition> set = new TreeSet<>();
		set.add(pBook);
		set.add(pBook2);
		set.add(mag);
		
		for (PrintingEdition element : set)
			System.out.println(element.getTitle() + " " + element.getPrice());
		
	}

}
