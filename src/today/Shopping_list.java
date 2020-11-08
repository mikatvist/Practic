package today;
import java.util.Scanner;
public class Shopping_list {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();

        double pr1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");

        String item2 = scan.next();

        double pr2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");

        String item3 = scan.next();

        double pr3 = scan.nextDouble();

        double total = pr1 + pr2 + pr3;
        String report = "Item1: " + item1 + " Price: " + pr1 + ", Item2: " + item2 + " Price: " + pr2 + ", Item3: " + item3 + " Price: " + pr3;
        System.out.println(report);
        System.out.println("Total price: " + total);
    }
}
