package many_to_many;

import java.util.Arrays;

public class StudentCourseDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Shuvam",63);
		Student s2 = new Student("Ram",52);
		
		Course c1 = new Course("java",5);
		Course c2 = new Course("Python",8);
		Course c3 = new Course("C++",2);
		
		s1.addCourse(c1);
		s1.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c1);
		s2.addCourse(c2);
		
		
		
		
		System.out.println(Arrays.toString(s1.arr)+"\t"+Arrays.toString(s2.arr));
		System.out.println(s2.arr[2].name);
	}
}
