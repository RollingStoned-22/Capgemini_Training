package exception_handling;

import one_to_many.User;

public class UserLogin {
	private int pin = 5432;
	
	public void login(int pin) throws InvalidPinException {
		if(this.pin == pin) 
			System.out.println("User successfully logged in");
		else
			throw new InvalidPinException("Invalid Pin");
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		UserLogin user = new UserLogin();
		try {
			user.login(5435);
		} catch (InvalidPinException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("main() ends");
	}
}
