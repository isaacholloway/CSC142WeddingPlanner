
public class Test {

    private static void testMethod(){

    }




	//static int totalGuests2;
	//static int maxGuests2;

	public static void main(String[] args) {

		/*
		returns fullSet[], fullSet[0]= # of large tables, fullSet[1] = # of people at each large table,
		~if applicable~ fullSet[2] = # of small tables, fullSet[3] = # of people at each small table
		 */
		Table.setTable(62,8);
		Table.getTable();
		System.out.println(Table.fullSet[0] + " " + Table.fullSet[1] + " " + Table.fullSet[2] + " " + Table.fullSet[3]);





	}

}
