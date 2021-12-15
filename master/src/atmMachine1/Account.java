package atmMachine1;

public class Account implements IDatabase {

	private int balance;
	private String type;
	private String owners;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	
	
	public Account(int balance, String type, String owners) {
		super();
		this.balance = balance;
		this.type = type;
		this.owners = owners;
	}
	
	
	@Override
	public void log() {
		System.out.println("Account logged..");
		
	}
	
	

	
	

}
