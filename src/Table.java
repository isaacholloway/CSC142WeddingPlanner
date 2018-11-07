

public class Table {




    public static int[] fullSet = new int[4];


    private static int maxG;
    private static int totalG;

    public static void setTable(int totalGuests, int maxGuests) {
        maxG = maxGuests;
        totalG = totalGuests;

    }




    public static int[] getTable(){
        if (totalG == 0 | maxG == 0){
            System.out.println("The object trying to be accessed has not yet been created.");
            System.out.println("The Program requires 2 variables to be set in order to calculate optimal setting.");
            System.out.println("The two required variables are the total number of guests and the maximum number of guests per table.");
            System.out.println("...");
            try {
                Thread.sleep(2000);
            }
                catch (InterruptedException ex) {
                    System.out.println("Thread was interrupted while sleeping.");
                }
            System.out.println("Enter your parameters to proceed");
            Inputs input1 = new Inputs();
            setTable(input1.totalGuestsScanner(), input1.maxGuestsScanner());
            }

        int indicator = totalG % maxG;
        if (indicator == 0) {
            // indicator == 0 means there is only one table 'set' because it is a perfect square
            int perfectTableSize = totalG/maxG;
            fullSet[0] = maxG;
            fullSet[1] = perfectTableSize;

        }
        else {
            //This creates two sets of tables: [(nL),(m)] & [(nS),(m-1)]
            int tablesI = totalG / maxG;
            int numSmallTables = maxG - indicator;
            int smallTableSize = maxG - 1;
            int numLargeTables = tablesI - numSmallTables + 1;
            fullSet[0] = numLargeTables;
            fullSet[1] = maxG;
            fullSet[2] = numSmallTables;
            fullSet[3] = smallTableSize;
        }

        double maxF = maxG;
        double maxI = totalG/maxF;

        if(maxI%1 == 0) {                       //tells us that there is a perfect set of tables
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



    public static void main(String[] args) {



    }

}
