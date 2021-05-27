package Assignment.gameData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import com.mysql.jdbc.Connection;

public class ReadData {

	public void readFile() throws Exception {
		char[] dataIn = new char[8000];
		String pathname = "F:\\PROGRAMING\\JAVA Progrmming\\Assignment one Game data analysis\\src\\Assignment\\gameData\\gamefilesmall.csv";
		File file = new File(pathname);
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		reader.read(dataIn);
		reader.close();

		String stringFile = String.valueOf(dataIn);

		separateValue(stringFile);

	}

	public static void separateValue(String stringFile) throws Exception {

		String[] fileByLine = stringFile.split("\\n");
		// for (int i = 0; i < fileByLine.length; i++) {
		// if(i == 0){
		// checkingHeaders(fileByLine[i]);
		// }
		// }

		for (int i = 5; i < fileByLine.length; i++) {
			createHeaders(fileByLine[i]);
		}

	}

	// public static void checkingHeaders(String headFile){
	// String[] headElementArray = headFile.split("\\|");
	// System.out.println(headElementArray.length);
	// }

	public static void createHeaders(String headString) throws Exception {
		CreateTables ct = new CreateTables();
		Connection con = (Connection) ct.getDataBaseConnection();
		if ((!headString.isEmpty())) {
			String[] headElementArray = headString.split("\\|");
			System.out.println("zeroth element " + headElementArray[0]);
			char[] c = new char[headString.length()];
			c = headString.toCharArray();

			// for (int i = 0; i < headElementArray.length; i++) {
			// headElementArray[i].trim();
			// System.out.println(headElementArray[i]);
			// }
			int i = c[0];

			if ((i == 49) && (!headString.isEmpty())) {
				System.out.println("inside check 1 mapping");
			
				HeaderOneElements hOneE = new HeaderOneElements();
				hOneE.setVLT_ID(headElementArray[1]);
				hOneE.setCreationDateTime(headElementArray[2]);
				hOneE.setLogSequence(headElementArray[3]);
				hOneE.setDeviceID(headElementArray[4]);
				hOneE.setTransactionID(headElementArray[5]);
				hOneE.setGameTime(headElementArray[6]);
				hOneE.setPlayState(headElementArray[7]);
				hOneE.setPlayResult(headElementArray[8]);
				hOneE.setDenom(headElementArray[9]);
				hOneE.setInitial_wager(headElementArray[10]);
				hOneE.setInitialWin(headElementArray[11]);
				hOneE.setSecondaryPlayed(headElementArray[12]);
				hOneE.setSecondary_wager(headElementArray[13]);
				hOneE.setSecondaryWin(headElementArray[14]);
				hOneE.setFinalWin(headElementArray[15]);
				hOneE.setPaytableId(headElementArray[16]);
				hOneE.setThemeId(headElementArray[17]);
				hOneE.setInitialStartTime(headElementArray[18]);
				hOneE.setInitialPlayerCashableAmount(headElementArray[19]);
				hOneE.setInitialPlayerNonCashableAmount(headElementArray[20]);
				hOneE.setInitialPlayerPromoAmount(headElementArray[21]);
				hOneE.setPlayerCashableAmount(headElementArray[22]);
				hOneE.setPlayerNonCashableAmoun(headElementArray[23]);
				hOneE.setPlayerPromoAmount(headElementArray[24]);
				hOneE.setPlayerSessionID(headElementArray[25]);
				hOneE.setPlayerID(headElementArray[26]);
				
				ct.createtTableForHeaderOne(hOneE,con);
				

			} else if (i == 50 && (!headString.isEmpty())) {
				System.out.println("inside check 2 mapping");
				
				HeaderTwoElements hTwoE = new HeaderTwoElements();
				hTwoE.setWinLevelIndex(headElementArray[1]);
				hTwoE.setWinLevelCombo(headElementArray[2]);
				hTwoE.setProgressiveAllowed(headElementArray[3]);
				
				ct.createtTableForHeaderTwo(hTwoE,con);

			} else if (i == 51 && (!headString.isEmpty())) {
				System.out.println("inside check 3 mapping");
				
				HeaderThreeElements hThreeE = new HeaderThreeElements();
				hThreeE.setDeviceClass(headElementArray[1]);
				hThreeE.setDeviceID(headElementArray[2]);
				hThreeE.setTransactionID(headElementArray[3]);
				hThreeE.setLogSequence(headElementArray[4]);
				hThreeE.setCashableAmount(headElementArray[5]);
				hThreeE.setPromoAmount(headElementArray[6]);
				hThreeE.setNonCashableAmount(headElementArray[7]);
				
				ct.createtTableForHeaderThree(hThreeE,con);

			} else if (i == 52 && (!headString.isEmpty())) {
				System.out.println("inside check 4 mapping");
				
				HeaderFourElements hFourE = new HeaderFourElements();
				hFourE.setVLTID(headElementArray[1]);
				hFourE.setCreationDateTime(headElementArray[2]);
				hFourE.setDeviceID(headElementArray[3]);
				hFourE.setTransactionID(headElementArray[4]);
				hFourE.setCurrencyID(headElementArray[5]);
				hFourE.setDenomID(headElementArray[6]);
				hFourE.setBaseCashableAmt(headElementArray[7]);
				hFourE.setNoteDateTime(headElementArray[8]);
			
				ct.createtTableForHeaderFour(hFourE,con);

			} else if (i == 53 && (!headString.isEmpty())) {
				System.out.println("inside check 5 mapping");
				
				HeaderFiveElements hFiveE = new HeaderFiveElements();
				hFiveE.setVLTID(headElementArray[1]);
				hFiveE.setCreationDateTime(headElementArray[2]);
				hFiveE.setDeviceID(headElementArray[3]);
				hFiveE.setTransactionID(headElementArray[4]);
				hFiveE.setValidationID(headElementArray[5]);
				hFiveE.setVoucherSequenc(headElementArray[6]);
				hFiveE.setVoucherAmt(headElementArray[7]);
				hFiveE.setTransferDateTime(headElementArray[8]);
				
				ct.createtTableForHeaderFive(hFiveE,con);

			}
			
			con.close();
		}
		
		
	}

}
