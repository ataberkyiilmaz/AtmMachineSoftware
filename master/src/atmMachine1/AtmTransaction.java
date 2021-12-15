package atmMachine1;

public class AtmTransaction {
	
	private String transactionId;
	private int date;
	private String type;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void modifies() {
		
		
	}
	
	public AtmTransaction(String transactionId, int date, String type) {
		this.transactionId = transactionId;
		this.date = date;
		this.type = type;
	}
	
	
	
}
