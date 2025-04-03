package exception_handling;

public class Child extends Parent{
	void demo() {
		System.out.println("Child");
	}
	public static void main(String[] args) {
		System.out.println("main()");
		Child obj = new Child();
		obj.demo();
	}
}
