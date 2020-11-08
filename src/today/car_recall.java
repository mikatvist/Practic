package today;
import java.util.Scanner;
public class car_recall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:


        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            System.out.println("Your vehicle needs to be recalled!");

        } else if (vehicleYear >= 2001 && vehicleYear <= 2002) {
            System.out.println("Your vehicle needs to be recalled!");

        } else if (vehicleYear >= 2004 && vehicleYear <= 2006) {
            System.out.println("Your vehicle needs to be recalled!");

        } else if (vehicleYear >= 2015 && vehicleYear <= 2017) {
            System.out.println("Your vehicle needs to be recalled!");

        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else {

            int change = 100 - itemPrice;
            int quarters = change / 25;

            int afterQuarter = change % 25;
            int dimes = afterQuarter / 10;

            int afterDimes = afterQuarter % 10;
            int nickels = afterDimes / 5;

            String result = "Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.";
            System.out.println(result);


        }
    }
}