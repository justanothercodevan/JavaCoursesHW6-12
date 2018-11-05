package by.epam.hw6;

public class GroupLogic {
	public double avrMark(Student st) {
		int [] marks = st.getMarks();
		double sum = 0;		
		for (int i = 0; i < marks.length; i++) {
			sum+= marks[i];
		}
		double avg = (marks.length==0) ? 0.0 : sum/marks.length;
		return avg;
		
	}
	
	public double avrMarkInGroup(Group gr) {
		Student [] students = gr.getStudents();
		double sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum+=avrMark(students[i]);
		}
		double avg = (students.length==0) ? 0.0 : sum/students.length;
		return avg;
	}
	
	public double[] avrStudentsMark(Group gr) {
		
		return null;
	}
}
