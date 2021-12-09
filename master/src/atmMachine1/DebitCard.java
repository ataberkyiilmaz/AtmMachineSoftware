package atmMachine1;

public class DebitCard {
	
	private int cardId;
	private String ownedBy;
	
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}
	
	public void access() {
		
		
	}
	
	public DebitCard(int cardId, String ownedBy) {
		this.cardId = cardId;
		this.ownedBy = ownedBy;
	}
	
	
	

}
