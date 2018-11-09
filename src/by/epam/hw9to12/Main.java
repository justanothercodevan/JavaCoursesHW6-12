package by.epam.hw9to12;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.addEdition(new ProgrammerBook("JAVA Core",2013,20000,"Java"));
		lib.addEdition(new ProgrammerBook("Python for dummies",2012,20000,"Python"));
		lib.addEdition(new Magazine("National geografic",2012,2000,"Nature"));
		
		List<PrintingEdition> find = lib.findByTitle("JAVA Core");
		lib.printList(find);
		lib.printTable(find);
		
	}

}
