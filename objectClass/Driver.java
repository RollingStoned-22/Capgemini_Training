package objectClass;

import java.util.Objects;

public class Driver {
	public static void main(String[] args) {
		Employee emp1 = new Employee(5,"Shuvam",60000);
		Employee emp2 = new Employee(5,"Shuvam",60000);
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();
		String name = "Rohit";
		System.out.println(emp1.equals(emp2));
		System.out.println(name.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(Objects.equals(emp4,emp5));
		Employee ref = new Employee();
//		Object e1 = ref.clone();
		
//		System.out.println(emp3.equals(emp4));
//		System.out.println(emp1.equals("Shuvam"));
//		System.out.println(emp2.equals(emp1));
//		System.out.println(Objects.equals(emp3, emp4));
//		System.out.println(emp3.equals(emp4));
//		System.out.println(emp3.equals(emp4));
//		System.out.println(emp4.equals(emp5));
//		System.out.println(emp3.equals(emp5));
//		System.out.println(emp1.equals(emp1));
//		System.out.println(emp1.equals(emp2));
//		System.out.println(emp2.equals(emp1));
//		System.out.println(emp1.hashCode());
//		System.out.println(emp.toString());
//		System.out.println("HexString of "+emp.hashCode()+" is: "+Integer.toHexString(emp.hashCode()));
//		System.out.println(emp.getClass());
//		System.out.println(emp.getClass().getName()+"@"+Integer.toHexString(emp.hashCode()));
		}
}
