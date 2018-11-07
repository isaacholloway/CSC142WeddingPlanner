import java.util.Scanner;
public class Inputs {

    public int totalGuestsScanner(){
    System.out.println("How many guests will be attending?");
    Scanner sc1 = new Scanner(System.in);
    return sc1.nextInt();
}
    public int maxGuestsScanner() {
        System.out.println("How many guests will each table hold?");
        Scanner sc2 = new Scanner(System.in);
        return sc2.nextInt();
    }
}
