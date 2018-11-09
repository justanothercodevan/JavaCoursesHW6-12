package by.epam.hw9to12;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.addEdition(new ProgrammerBook("JAVA Core",2013,20000,"Java"));
		lib.addEdition(new ProgrammerBook("Python for dummies",2012,20000,"Python"));
		//lib.addEdition(new Magazine("Python for dummies",2012,20000,"Python"));

	}

}
