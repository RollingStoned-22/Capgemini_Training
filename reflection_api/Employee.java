package reflection_api;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private int age;
	
	public Employee(String name, double salary, int id, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	public double getDouble(){
		return this.salary;
	}
	public int getAge(){
		return this.age;
	}
	public int getId(){
		return this.id;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+age+" "+salary;
	}
	
}
