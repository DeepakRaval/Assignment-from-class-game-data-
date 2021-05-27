package Assignment.gameData;

public class HeaderFourElements {

	String VLTID;         
	String CreationDateTime;          
	String DeviceID;      
	String transactionID; 
	String currencyID;    
	String denomID;       
	String baseCashableAmt;
	String noteDateTime;                
	String insideheaderfourfile;
	
	
	public String getVLTID() {
		return VLTID;
	}
	public void setVLTID(String vLTID) {
		VLTID = vLTID;
	}
	public String getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(String creationDateTime) {
		CreationDateTime = creationDateTime;
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
	public String getCurrencyID() {
		return currencyID;
	}
	public void setCurrencyID(String currencyID) {
		this.currencyID = currencyID;
	}
	public String getDenomID() {
		return denomID;
	}
	public void setDenomID(String denomID) {
		this.denomID = denomID;
	}
	public String getBaseCashableAmt() {
		return baseCashableAmt;
	}
	public void setBaseCashableAmt(String baseCashableAmt) {
		this.baseCashableAmt = baseCashableAmt;
	}
	public String getNoteDateTime() {
		return noteDateTime;
	}
	public void setNoteDateTime(String noteDateTime) {
		this.noteDateTime = noteDateTime;
	}
	public String getInsideheaderfourfile() {
		return insideheaderfourfile;
	}
	public void setInsideheaderfourfile(String insideheaderfourfile) {
		this.insideheaderfourfile = insideheaderfourfile;
	}
}
