package exception_handling;

public class ATM {
	double balance;
	int pin;

	public ATM(double balance, int pin) {
		this.balance = balance;
		this.pin = pin;
	}

	public boolean login (int pin) {
		if (this.pin == pin)
		{
			System.out.println("User logged in successfully");
			return true;
		}
		else
		{
			throw new InvalidPinException("Invalid pin. Enter valid pin");
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount deposited.\nCurrent balance: "+this.balance);
	}
	
	public void withdraw(double amount) {
		if(this.balance > amount){
			this.balance -= amount;
			System.out.println("Amount windrawn.\nCurrent balance: "+this.balance);
		}
		else
			throw new InsufficientBalanceException("Insufficient Balance in your account.");
	}

	public static void main(String[] args) {
		ATM atm = new ATM(5000, 5432);
		if(atm.login(5432)) {
			atm.deposit(2000);
			atm.withdraw(786000);
		}

	}

}
