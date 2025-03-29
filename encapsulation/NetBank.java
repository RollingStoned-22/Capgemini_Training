package encapsulation;

public class NetBank {
	private int currentBalance = 50000;
	private int pin = 1234;

	public void setBalance(int deposit,int pin) {
		if(this.pin==pin) {

			currentBalance += deposit;
		}else {
			System.out.println("Invalid Pin");
		}
	}

	public void getBalance(int pin) {
		if(this.pin==pin) {

			System.out.println("The Available Balance: "+currentBalance);
		}else {
			System.out.println("Invalid Pin");
		}
	}

	public void withdraw(int withdraw,int pin) {
		if(this.pin==pin) {
			currentBalance -= withdraw;
			System.out.println("Withdraw Amount: "+withdraw);
			System.out.println("The Available Balance: "+currentBalance);
		}else {
			System.out.println("Invalid Pin");
		}
		
	}
}
