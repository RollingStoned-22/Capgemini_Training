package encapsulation;


public class NetBankDriver {
public static void main(String[] args) {
	NetBank n = new NetBank();
	n.setBalance(12000,1234);
	n.getBalance(1234);
}
}
