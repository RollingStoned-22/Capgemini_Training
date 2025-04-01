package strings;

public class Demo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s3 = "hello";
		String s2 = s1 +" hori bol";
		System.out.println(s1.intern());
		System.out.println(String.join("jobe","hobe","dekha jabe"));
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
//		String s2 = new String("hello");
//		System.out.println(s2.equals(s1));
//		char[] arr = {'h','e','l','l','o'};
//		String s = new String(arr);
//		System.out.println(s);
	}

}
