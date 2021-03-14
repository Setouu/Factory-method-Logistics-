import java.util.Scanner;

public class Main {
    //colors for the text in the code
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        AssignmentLogistics advisor = new AssignmentLogistics();
        while (true) {
            System.out.println(CYAN + "\n\n\nNow I can test the my logistics ways one more time ...\n " + GREEN + "Choose from where you are going:\n Zhezkazgan\n Almaty" + RESET);
            String toPlace = null;
            double price;
            String fromPlace = scanner.next();
            if (fromPlace.equals("Zhezkazgan")) {
                System.out.println(YELLOW + "Choose destination place:\n Almaty" + RESET);
                toPlace = scanner.next();
                price = advisor.getCheapestPrice(fromPlace, toPlace);
                System.out.println(GREEN + "A cheapest trip from " + WHITE + fromPlace + GREEN + " to " + WHITE + toPlace + WHITE + " costs " + YELLOW + price + GREEN + "$.");

            } else if (fromPlace.equals("Almaty")) {
                System.out.println(YELLOW + " Choose destination place:\n Zhezkazgan" + RESET);
                toPlace = scanner.next();
                price = advisor.getCheapestPrice(fromPlace, toPlace);
                System.out.println(GREEN + "A cheapest trip from " + PURPLE + fromPlace + GREEN + " to " + PURPLE + toPlace + GREEN + " costs " + YELLOW + price + GREEN + "$.");

            } else {
                System.out.println(RED + " This place doesn't exist! Please try again..." + RESET);
            }


        }
    }

}
