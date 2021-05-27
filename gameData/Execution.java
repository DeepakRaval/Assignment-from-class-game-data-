package Assignment.gameData;



public class Execution {
	
	public static void main(String[] args) {
		
	System.out.println("adding data to Database");
		try {
			new ReadData().readFile();
			} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("Done ... ");
	
	}

}
