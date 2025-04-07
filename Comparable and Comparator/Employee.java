package comparable_and_comparator;

public class Employee implements Comparable {
	public int id;
	public String name;
	public double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static String getName(Employee e) {
		return e.name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// comparing on basis of employee salary
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Employee e = (Employee) o;
//
//		return (int) (this.salary - e.salary);
//	}
//	

	// comparing on basis of employee name
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee) o;

		return (int) ((this.name).compareTo(e.name));
	}

}
