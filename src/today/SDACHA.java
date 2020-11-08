package today;
import java.util.Scanner;
public class SDACHA {
    public static void main(String[] args) {
        //ENTER CODE HERE

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if(itemPrice< 25 || itemPrice>100 ||itemPrice%5 !=0){
            System.out.println("Invalid price!");
        }else{

            int change = 100 - itemPrice;
            int quarters= change / 25;

            int afterQuarter = change%25;
            int dimes = afterQuarter/10;

            int afterDimes = afterQuarter%10;
            int nickels = afterDimes/5;

            String result = "Your change is "+ quarters+" quarters, "+dimes+" dimes, and "+ nickels+" nickels.";
            System.out.println(result);




        }


    }
}

