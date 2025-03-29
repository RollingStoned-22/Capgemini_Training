package one_to_many;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void displayPersonDetails() {
		System.out.print(this.name+"\t"+this.age);
	}
}
