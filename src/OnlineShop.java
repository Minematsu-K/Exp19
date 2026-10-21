
public class OnlineShop {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
		
		account.showBalance();
		
		account.setBalance(500000);
		account.showBalance();
	}

}
