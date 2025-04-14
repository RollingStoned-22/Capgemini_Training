package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student = new Student<Person>(new Person<Integer,String>(63,"Shuvam"));
		printDetails(student);
		
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(false);
		list.add(true);
		
		print(list);
		
		List<Number> l2 = new ArrayList<Number>();
		l2.add(5);
		l2.add(4);
		l2.add(3);
		l2.add(2);
		l2.add(1);
		
		printData(l2);
	}
	
	public static void printDetails(Student <? extends Person> student) {
		Person p = student.obj;
		System.out.println(p);
	}
	
	public static void print(List<? extends Object> list) {
		System.out.println(list);
	}
	public static void printData(List<? super Integer> list) {
		list.removeLast();
		System.out.println(list);
	}
	
	
}
