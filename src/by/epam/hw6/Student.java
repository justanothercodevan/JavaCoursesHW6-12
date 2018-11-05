package by.epam.hw6;

public class Student {

	private String name;
	int [] marks;
	
	public Student (String name, int [] marks) {
		this.name = name;
		this.marks = marks;		
	}

	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}
}
