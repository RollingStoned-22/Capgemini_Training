package exception_handling;

public class ThrowsKeyword {
	public static void main(String[] args) {
		try {
			div(54,5);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
			catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public static void div(int a, int b) throws RuntimeException, ClassNotFoundException, Exception {
		System.out.println(a / b);
		Class.forName("Dem1-e");
	}
}
