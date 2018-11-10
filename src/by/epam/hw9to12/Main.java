package by.epam.hw9to12;

import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		
		ProgrammerBook pBook = new ProgrammerBook("JAVA Core",2013,20000, "Ekkel","Java");
		ProgrammerBook pBook2 = new ProgrammerBook("Python for dummies",2009,21000,"Smith","Python");
		ProgrammerBook pBook3 = new ProgrammerBook("Python Advanced",2009,24000,"Smith","Python");
		ProgrammerBook pBook4 = new ProgrammerBook("Python",2004,24000,"Smith","Python");
		Magazine mag = new Magazine("National geografic",2012,2000,"Nature");		
		
		lib.addEdition(pBook);
		lib.addEdition(pBook2);
		lib.addEdition(pBook3);
		lib.addEdition(pBook4);
		lib.addEdition(mag);
		
		List<PrintingEdition> find = lib.findByTitle("JAVA Core");
		lib.printList(find);
		
		System.out.println();
		lib.printTable(find);
		
		
		TreeSet <PrintingEdition> set = new TreeSet<>();
		set = lib.findByAuthor("Smith");
		
		System.out.println();
		for (PrintingEdition element : set)
			System.out.println(element.getTitle() + " " + element.getPrice());
		
	}

}
