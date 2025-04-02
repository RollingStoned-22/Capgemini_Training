package string_buffer;

import java.util.Scanner;

public class Shuvam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		str.append(true);
		str.append('d');
		str.append(" this is a buffer"); 
//		char[] arr = {'a','b','c'};
//		StringBuffer str2 = new StringBuffer("Second string buffer");
//		str2.append(arr);
//		System.out.println(str2);
//
//		System.out.println(str2.delete(2,10));
//		System.out.println(str2.insert(2, "cond str"));
//		System.out.println(str);
//		System.out.println(str.insert(2, arr,0,3));
//		System.out.println(str.lastIndexOf("buff"));
//		System.out.println(str2.length());
//		System.out.println(str2.capacity());
//		str2.ensureCapacity(50);
//		System.out.println(str2.capacity());
//		System.out.println(str2.length());
//		System.out.println(str.reverse());
//		str.setCharAt(0, 'f');
//		
//		System.out.println(str.toString());
//		String s = new String(str);
//		System.out.println(s);
		System.out.println(str);
		System.out.println(str.capacity());
		System.out.println(str.length());
		str.trimToSize();
		System.out.println(str.capacity());
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.offsetByCodePoints(5, 12));
	}
}
