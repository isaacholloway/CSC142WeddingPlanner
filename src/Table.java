import java.util.Scanner;

public class Table {

	private static Scanner sc1;
	private static Scanner sc2;
	
	static int indicator;
	static int[] fullSet = new int[4];
	static int test1 = 63;
	static int test2 = 8;
	
	
	private static void setTable(int totalGuests, int maxGuests) {
		pointer(totalGuests, maxGuests);
	}
	
	private static void pointer(int totalGuests, int maxGuests) {
		indicator = totalGuests % maxGuests;
		
		if(indicator ==0) {
			perfSquareTables(totalGuests, maxGuests);
			
		}
		else {
			imperfectTables(totalGuests, maxGuests);
		}
	}
	private static void imperfectTables(int totalGuests, int maxGuests) {
		int tablesI = totalGuests / maxGuests;
		int numSmallTables = maxGuests - indicator;
		int smallTableSize = maxGuests - 1;
		int numLargeTables = tablesI - numSmallTables + 1;
		fullSet[0] = numLargeTables;
		fullSet[1] = maxGuests;
		fullSet[2] = numSmallTables;
		fullSet[3] = smallTableSize;
		System.out.println(fullSet[0] + " " + fullSet[1] + " " + fullSet[2] + " " + fullSet[3] );
		
	}

	
	private static void perfSquareTables(int totalGuests, int maxGuests) {

		int perfTableSize = totalGuests/maxGuests;
		fullSet[0] = maxGuests;
		fullSet[1] = perfTableSize;
		
		
	}
	
		
	
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

	
	public static void main(String[] args) {
		setTable(test1,test2);
	}

}
