package Assignment.gameData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTables {

	public  Connection getDataBaseConnection(){
		String url = "jdbc:mysql://localhost:3306/gamming_data";
		String userName = "root";
		String password = "1996";
		String driverClassPath = "com.mysql.jdbc.Driver";

			Connection con = null;
			try {
				Class.forName(driverClassPath);
				con = DriverManager.getConnection(url, userName, password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return con;
	}
	
	public  void createtTableForHeaderOne(HeaderOneElements hoe, Connection con) throws SQLException{
		
		PreparedStatement stmt ;
		
		String Querry = "insert into table_header_one (VLT_ID,CreationDateTime, LogSequence, DeviceID, TransactionID, GameTime, playState, playResult, Denom, Initial_wager, Final_wager, InitialWin, SecondaryPlayed, Secondary_wager, SecondaryWin, FinalWin, paytableId, ThemeId, InitialStartTime, InitialPlayerCashableAmount, InitialPlayerNonCashableAmount, InitialPlayerPromoAmount, playerCashableAmount, playerNonCashableAmoun,	playerPromoAmount, PlayerSessionID, PlayerID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(Querry);
//		HeaderOneElements h1 = new HeaderOneElements();
		stmt.setString(1, hoe.getVLT_ID());
		stmt.setString(2, hoe.getCreationDateTime());
		stmt.setString(3, hoe.getLogSequence());
		stmt.setString(4, hoe.getDeviceID());
		stmt.setString(5, hoe.getTransactionID());
		stmt.setString(6, hoe.getGameTime());
		stmt.setString(7, hoe.getPlayState());
		stmt.setString(8, hoe.getPlayResult());
		stmt.setString(9, hoe.getDenom());
		stmt.setString(10, hoe.getInitial_wager());
		stmt.setString(11, hoe.getFinal_wager());
		stmt.setString(12, hoe.getInitialWin());
		stmt.setString(13, hoe.getSecondaryPlayed());
		stmt.setString(14, hoe.getSecondary_wager());
		stmt.setString(15, hoe.getSecondaryWin());
		stmt.setString(16, hoe.getFinalWin());
		stmt.setString(17, hoe.getPaytableId());
		stmt.setString(18, hoe.getThemeId());
		stmt.setString(19, hoe.getInitialStartTime());
		stmt.setString(20, hoe.getInitialPlayerCashableAmount());
		stmt.setString(21, hoe.getInitialPlayerNonCashableAmount());
		stmt.setString(22, hoe.getInitialPlayerPromoAmount());
		stmt.setString(23, hoe.getPlayerCashableAmount());
		stmt.setString(24, hoe.getPlayerNonCashableAmoun());
		stmt.setString(25, hoe.getPlayerPromoAmount());
		stmt.setString(26, hoe.getPlayerSessionID());
		stmt.setString(27, hoe.getPlayerID());
		
		stmt.executeUpdate();
	}
	
	public  void createtTableForHeaderTwo(HeaderTwoElements hte, Connection con) throws SQLException{
		PreparedStatement stmt ;
		
		String Querry = "insert into table_header_two (winLevelIndex, winLevelCombo, progressiveAllowed ) values (?,?,?)";
		stmt = con.prepareStatement(Querry);
//		HeaderTwoElements h2 = new HeaderTwoElements();
		stmt.setString(1, hte.getWinLevelIndex());
		stmt.setString(2,hte.getWinLevelCombo());
		stmt.setString(3, hte.getProgressiveAllowed());

		stmt.executeUpdate();
	}
	
	public  void createtTableForHeaderThree(HeaderThreeElements hte, Connection con)throws SQLException{
		PreparedStatement stmt ;
		
		String Querry = "insert into table_header_three (DeviceClass, DeviceID, transactionID, LogSequence, CashableAmount, PromoAmount,  NonCashableAmount) values (?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(Querry);
//		HeaderThreeElements h3 = new HeaderThreeElements();
		stmt.setString(1, hte.getDeviceClass());
		stmt.setString(2, hte.getDeviceID());
		stmt.setString(3, hte.getTransactionID());
		stmt.setString(4, hte.getLogSequence());
		stmt.setString(5, hte.getCashableAmount());
		stmt.setString(6, hte.getPromoAmount());
		stmt.setString(7, hte.getNonCashableAmount());

		stmt.executeUpdate();
	}
	
	public  void createtTableForHeaderFour(HeaderFourElements hfe, Connection con)throws SQLException{
		
		PreparedStatement stmt ;
		
		String Querry = "insert into table_header_four (VLTID, CreationDateTime, DeviceID, transactionID, currencyID, denomID, baseCashableAmt, noteDateTime, insideheaderfourfile) values (?,?,?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(Querry);
//		HeaderFourElements h4 = new HeaderFourElements();
		stmt.setString(1, hfe.getVLTID());
		stmt.setString(2, hfe.getCreationDateTime());
		stmt.setString(3, hfe.getDeviceID());
		stmt.setString(4, hfe.getTransactionID());
		stmt.setString(5, hfe.getCurrencyID());
		stmt.setString(6, hfe.getDenomID());
		stmt.setString(7, hfe.getBaseCashableAmt());
		stmt.setString(8, hfe.getNoteDateTime());
		stmt.setString(9, hfe.getInsideheaderfourfile());

		stmt.executeUpdate();
	}
	
	public  void createtTableForHeaderFive(HeaderFiveElements hfe, Connection con)throws SQLException{
		
		PreparedStatement stmt ;
		
		String Querry = "insert into table_header_five ( VLTID, CreationDateTime, DeviceID, transactionID, validationID, voucherSequenc, voucherAmt, transferDateTime, insideheaderfivefile) values (?,?,?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(Querry);
//		HeaderFiveElements h5 = new HeaderFiveElements();
		stmt.setString(1, hfe.getVLTID());
		stmt.setString(2, hfe.getCreationDateTime());
		stmt.setString(3, hfe.getDeviceID());
		stmt.setString(4, hfe.getTransactionID());
		stmt.setString(5, hfe.getValidationID());
		stmt.setString(6, hfe.getVoucherSequenc());
		stmt.setString(7, hfe.getVoucherAmt());
		stmt.setString(8, hfe.getTransferDateTime());
		stmt.setString(9, hfe.getInsideheaderfivefile());

		stmt.executeUpdate();
	}
	
}
