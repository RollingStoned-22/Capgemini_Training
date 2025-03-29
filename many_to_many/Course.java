package many_to_many;

public class Course {
	String name;
	Student[] students;
	
	Course(String name, int size){
		this.name = name;
		this.students = new Student[size];
	}
}
