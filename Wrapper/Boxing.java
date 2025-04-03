package wrapper;

public class Boxing {
	public static void main(String[] args) {
		
		//Unboxing
		Integer i = 10;
		int x = i.intValue();
		
		//Auto-unboxing
		Integer u = 75;
		int v = u;
		
		//AutoBoxing
		int y = 85;
		Integer z = y;
		System.out.println(x);
		
		//Boxing
		Integer p = Integer.valueOf(y);
		
		Integer q = 7;
		Integer r = 7;
		System.out.println(q==r);
		System.out.println(Integer.reverse(r));
		
	}
}
