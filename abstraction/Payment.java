package abstraction;

public abstract class Payment {
	private double amount;
	private int transactionID;
	
	public Payment(double amount, int transactionID) {
		this.amount   = amount;
		this.transactionID = transactionID;
	}
	public abstract void processPayment();
	public double getAmount() {
		return amount;
	}
	public int getID() {
		return transactionID;
	}
}
