package many_to_many;

public class Student {
	String name;
	Course[] arr;
	int count = 0;
	
	Student(String name, int size){
		this.name = name;
		arr = new Course[size];
	}
	
	public void addCourse(Course course) {
		if(count < arr.length)
			arr[count++] = course;
		else
			System.out.println("Array is full");
	}
}
