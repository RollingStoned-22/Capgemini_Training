package method_reff;

public class Driver {
	public static void main(String[] args) {
		Driver obj = new Driver();
		Demo d = obj::print;
		d.print(5,"YEET");
	}
	
	public void print(int n,String message) {
		for(int i = 1; i <= n; i++)
			System.out.println(message);
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
