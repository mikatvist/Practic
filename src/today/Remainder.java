package today;
import java.util.Scanner;
public class Remainder {



        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter number of coupons:");

            int coupons = scan.nextInt();

            if (coupons<3){
                System.out.println("Not enough coupons");
            }else{

                int candy1 = coupons / 10;
                int coupons2 = coupons % 10;
                int gumboll = coupons / 3;

                System.out.println("Number of Candies:" + candy1);
                System.out.println("Number of Gumballs:" + gumboll);
            }


        }
}








