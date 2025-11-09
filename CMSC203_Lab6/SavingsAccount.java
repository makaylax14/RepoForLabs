
public class SavingsAccount extends BankAccount{
	private double rate=2.5;
	private int savingsNumber=0;
	private String accountNumber;
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber=super.getAccountNumber()+"-"+savingsNumber;
	}
	public void postInterest() {
		double amount=(super.getBalance()*(rate/100))/12;
		super.setBalance(super.getBalance()+amount);
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber=super.getAccountNumber()+"-"+savingsNumber;
	}
}
