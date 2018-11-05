package by.epam.hw6;

public class Main {

	public static void main(String[] args) {
				
		Student st1 = new Student("Vasya", new int[] {3,4,5,4});
		Student st2 = new Student("Petya", new int[] {3,4,2,2});
		Student st3 = new Student("Vasya", new int[] {3,2,5,4});
		Student st4 = new Student("Olya", new int[] {4,4,5,5});
		
		Group grp = new Group(4);
		grp.addStudent(st1);
		grp.addStudent(st2);
		grp.addStudent(st3);
		grp.addStudent(st4);
		
		double avgMarkForStudent1 = new GroupLogic().avrMark(st1);
		System.out.println(avgMarkForStudent1);
		double avgMarkForStudent2 = new GroupLogic().avrMark(st2);
		System.out.println(avgMarkForStudent2);
		double avgMarkInGrp = new GroupLogic().avrMarkInGroup(grp);
		System.out.println(avgMarkInGrp);

	}

}
