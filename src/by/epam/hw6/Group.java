package by.epam.hw6;

public class Group {
	private Student[] students;
	private int index;
	
	public Group (int count) {
		this.students = new Student[count];
		index = 0;
		
	}
	
	public void addStudent (Student st) {
		// больше равно потому что есть шанс что кто то введет значение больше
		if(index >= students.length) {
			System.out.println("Group is full");
		} else {
			this.students[index]= st;
			this.index++;
		}		
	}
	
	public Student[] getStudents() {
		return this.students;
	}
}
