package one_to_many;

public class Student extends Person {
	private int studentID;
	
	public Student(String name, int age, int studentID) {
		super(name,age);
		this.studentID = studentID;
	}
	
	public void displayStudentDetails() {
		displayPersonDetails();
		System.out.println("\t"+this.studentID);
	}
	
}
