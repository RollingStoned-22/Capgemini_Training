package exception_handling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("main() starts");
//		System.out.println(5/0);
		System.out.println("main() ends");
		StringBuffer s = new StringBuffer("test");
		System.out.println(s.toString().toUpperCase());
		int[] arr = new int[-5];
		System.out.println(arr[-2]);
	}
}
