package Assignment.gameData;

public class HeaderTwoElements {
	
	
	String winLevelIndex;
	String winLevelCombo;   
	String progressiveAllowed; 
	
	

	public HeaderTwoElements() {
		super();
	}

	public HeaderTwoElements(String winLevelIndex, String winLevelCombo, String progressiveAllowed) {
		super();
		this.winLevelIndex = winLevelIndex;
		this.winLevelCombo = winLevelCombo;
		this.progressiveAllowed = progressiveAllowed;
	}
	
	public String getWinLevelIndex() {
		return winLevelIndex;
	}
	public void setWinLevelIndex(String winLevelIndex) {
		this.winLevelIndex = winLevelIndex;
	}
	public String getWinLevelCombo() {
		return winLevelCombo;
	}
	public void setWinLevelCombo(String winLevelCombo) {
		this.winLevelCombo = winLevelCombo;
	}
	public String getProgressiveAllowed() {
		return progressiveAllowed;
	}
	public void setProgressiveAllowed(String progressiveAllowed) {
		this.progressiveAllowed = progressiveAllowed;
	}
}
