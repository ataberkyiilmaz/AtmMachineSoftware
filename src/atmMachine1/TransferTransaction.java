package atmMachine1;

public class TransferTransaction {
	

	private int amount;
	private int accountNo;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public TransferTransaction(int amount, int accountNo) {
		this.amount = amount;
		this.accountNo = accountNo;
	}
	

}
