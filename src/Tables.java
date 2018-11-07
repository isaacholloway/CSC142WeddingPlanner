import java.util.Scanner;

public class Tables {
	
	
	static int totalGuests = totalGuestsScanner();
	static int maxGuests = maxGuestsScanner();
	private static Scanner sc1;
	private static Scanner sc2;
	static int indicator = totalGuests % maxGuests;
	
	public static int totalGuestsScanner(){
		System.out.println("How many guests will be attending?");
		sc1 = new Scanner(System.in);
	    int totalGuests = sc1.nextInt();
		return totalGuests;
	}
	public static int maxGuestsScanner() {
		System.out.println("How many guests will each table hold?");
		sc2 = new Scanner(System.in);
		int maxGuests = sc2.nextInt();
		return maxGuests;
	}

	static int fullTables = totalGuests/maxGuests;
	
	
	static int[] tableLG = new int[2];
	static int[] tableSM = new int[2];
	
	static int[] fullSet = new int[4];
	
	public void setTables (int[] array) {
		fullSet[0] = array[0];
		fullSet[1] = array[1];
		fullSet[2] = array[2];
		fullSet[3] = array[3];
	}
		
	
	public int[] getTables () {
		fullSet [0] = tableLG[0];
		fullSet[1] = tableLG[1];
		fullSet[2] = tableSM[0];
		fullSet[3] = tableSM[1];
		return fullSet;

	}
	
	public static void main(String[] args) {
		if(indicator == 0){
			int numPerfTables = maxGuests;
			int perfTableSize = totalGuests/maxGuests;
			
			System.out.println("With " + totalGuests + " guests and a maximum of " 
			+ maxGuests + " per table, the optimal seating arrangement should have " 
			+ numPerfTables + " tables of " + perfTableSize);
			tableLG[0] = numPerfTables;
			tableLG[1] = maxGuests;
		}
		else {
			int numSmallTables = maxGuests - indicator;
			int smallTableSize = maxGuests - 1;
			int numLargeTables = fullTables - numSmallTables + 1;
			
			
			
			
		    System.out.println("With " + totalGuests + " guests and a maximum of "
	        + maxGuests + " per table, the optimal seating arrangemnt should have "
	        + numLargeTables + " tables of " + maxGuests + " , and " + numSmallTables +  " tables of "
	        +  smallTableSize + " guests");
		    //int p = (numLargeTables*maxGuests)+(numSmallTables*smallTableSize);
		    //System.out.println(p);
		    tableLG[0] = numLargeTables;
		    tableSM[0] = numSmallTables;
		    tableLG [1] = maxGuests;
		    tableSM [1] = smallTableSize;
		
		
		}
		System.out.println(getTables());
	}
	
}
