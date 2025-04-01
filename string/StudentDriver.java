package strings;

public class StudentDriver {
	public static void main(String[] args) {
		Student stu1 = new Student("Shuvam", 1, "Male", 56);
		Student stu3 = new Student("Shuvam", 1, "Male", 56);
		Student stu2 = new Student("Samriddhi", 2, "Female", 84);
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.equals(stu3));
	}
}
