package Assignment.gameData;

public class HeaderThreeElements {

	String DeviceClass;   
	String DeviceID;      
	String transactionID; 
	String LogSequence;   
	String CashableAmount;
	String PromoAmount;   
	String NonCashableAmount; 

	public String getDeviceClass() {
		return DeviceClass;
	}
	public void setDeviceClass(String deviceClass) {
		DeviceClass = deviceClass;
	}
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getLogSequence() {
		return LogSequence;
	}
	public void setLogSequence(String logSequence) {
		LogSequence = logSequence;
	}
	public String getCashableAmount() {
		return CashableAmount;
	}
	public void setCashableAmount(String cashableAmount) {
		CashableAmount = cashableAmount;
	}
	public String getPromoAmount() {
		return PromoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		PromoAmount = promoAmount;
	}
	public String getNonCashableAmount() {
		return NonCashableAmount;
	}
	public void setNonCashableAmount(String nonCashableAmount) {
		NonCashableAmount = nonCashableAmount;
	}
	
	
	
}
