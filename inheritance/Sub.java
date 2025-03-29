package inheritance;

public class Sub extends Super{
	double a;
	static double b = 3.9;
	
	public void print() {
//		System.out.println(a);
//		System.out.println(super.a);
		System.out.println(b);
		System.out.println(Super.b);
	}
}
