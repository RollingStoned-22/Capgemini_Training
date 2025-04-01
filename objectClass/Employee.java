package objectClass;

import java.util.Objects;

public class Employee implements Cloneable{
	int id;
	String name;
	double salary;

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Employee) {
//			Employee emp = (Employee) obj;
//			return (emp.id == this.id && this.salary == emp.salary && this.name.equals(emp.name));
//		} else
//			return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return (int)(this.id+this.salary+this.name.hashCode());
//	}
//	
//	//worst way of overriding hashCode()
//	public int hashCode() {
//		return 1;
//	}

	
	

}
