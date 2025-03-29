package abstraction;

public class PayPal extends Payment {
	public PayPal(double amount, int transactionID) {
		super(amount,transactionID);
	}
	public void processPayment() {
		double amount = getAmount();
		int transactionID = getID();
		double discount=0.0, transactionFee, discounted_amount = amount, final_amount;
		System.out.println("Processing PayPal Payment.........");
		System.out.println("Transaction ID: TXN"+transactionID);
		System.out.println("Original Amount: $"+amount);
		
		if(amount > 500.0) {
			discount = 0.1*amount;
			discounted_amount = amount-discount;
			
		}
		transactionFee = 0.03*discounted_amount;
		final_amount = transactionFee + discounted_amount;
		System.out.println("Discount Applied: $"+discount );
		System.out.println("Transaction Fee: $"+transactionFee);
		System.out.println("Final Payable amount: $"+final_amount);
		System.out.println("Credit card payment successful!");
		}
	}

