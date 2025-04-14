package generics;

import java.util.HashMap;

public class Employee <T,K> {
	T id;
	K name;
	
	Employee(T id, K name){
		super();
		this.id= id;
		this.name = name;
		}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		Employee e = (Employee)o;
//		return (this.id - e.id);
//	}
	
	public static <T>void print(T[] arr){
		for(T item: arr)
			System.out.print(item+"\t");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee<Integer, String> e1 = new Employee<Integer, String>(5, "Shuvam");
		System.out.println(e1);
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(5, "case");
		System.out.println(map1.get(5));
		Integer[] arr = {7,9,3,5,4,2,8};
		String[] arr2 = {"ahybef","skbhreg","ksjcbe"};
		print(arr);
		print(arr2);
	}
	
	
}
