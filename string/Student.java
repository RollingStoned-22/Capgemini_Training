package strings;

public class Student {
	String name;
	int id;
	String gender;
	double marks;
	
	public Student(String name, int id, String gender, double marks) {
		this.name = name;
		this.marks = marks;
		this.gender = gender;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", marks=" + marks + "]";
	}
	
	@Override
	public int hashCode() {
		return (int)(this.id+this.marks+this.gender.hashCode()+this.name.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			return(this.name.equals(stu.name) && this.gender.equals(stu.gender) && this.id == stu.id && this.marks==stu.marks);
		}
		else
			return false;
	}
	
}
