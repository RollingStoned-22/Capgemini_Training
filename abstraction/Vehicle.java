package abstraction;

abstract public class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle constructor");
	}
	private static int a = 10;
	public static int b = 40;
	protected static int c = 7;
	abstract void start();
	protected abstract void stop();
//	abstract void run();
	void print() {
		System.out.println("print() is working");
	}
}
