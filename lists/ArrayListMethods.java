package lists;
import java.util.*;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList(al);
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println(al2.add(al));
		Object o = al2.get(5);
		System.out.println(((ArrayList)al2.get(5)).get(3));
		System.out.println(al2);
		List a = al2.subList(0	, 3);
		System.out.println(a);
	}
}
