import java.util.Scanner;

public class Table {


	
	private static int indicator;
	public static int[] fullSet = new int[4];
    private static Scanner sc1;
    private static Scanner sc2;
    static int maxG = 0;
    static int totalG = 0;

    public static int totalGuestsScanner(){
        System.out.println("How many guests will be attending?");
        sc1 = new Scanner(System.in);
        return sc1.nextInt();
    }
    public static int maxGuestsScanner() {
        System.out.println("How many guests will each table hold?");
        sc2 = new Scanner(System.in);
        return sc2.nextInt();
    }
	
	public static void setTable(int totalGuests, int maxGuests) {
        if (totalGuests == 0 | maxGuests == 0) {
            totalGuests = totalGuestsScanner();
            maxGuests = maxGuestsScanner();

        }

	    pointer(totalGuests, maxGuests);


	}
	public static int[] getTables(){
        if (totalG == 0 | maxG == 0){
            System.out.println("The object trying to be accessed has not yet been created." +
                    " Please enter the parameters of the wedding setting");
            setTable(0,0);

        }

        double maxF = maxG;
        if(totalG/maxF == maxF) {


            System.out.println("With " + totalG + " guests and a maximum of "
                    + maxG + " per table, the optimal seating arrangement should have "
                    + fullSet[0] + " tables of " + fullSet[1] + " guests");
        }
        else{

            System.out.println("With " + totalG + " guests and a maximum of " + maxG +
                    " per table, the optimal seating arrangement should have "
                    + fullSet[0] + " tables of " + fullSet[1] +  " guests, and " + fullSet[2] +  " tables of "
                    + fullSet[3] + " guests");
        }
        return fullSet;
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
        totalG = totalGuests;
        maxG = maxGuests;
		// System.out.println(fullSet[0] + " " + fullSet[1] + " " + fullSet[2] + " " + fullSet[3] );
	}

	
	private static void perfSquareTables(int totalGuests, int maxGuests) {
		int perfTableSize = totalGuests/maxGuests;
		fullSet[0] = maxGuests;
		fullSet[1] = perfTableSize;
		totalG = totalGuests;
		maxG = maxGuests;
        // System.out.println(fullSet[0] + " " + fullSet[1] );
	}


	
	public static void main(String[] args) {


	}

}
