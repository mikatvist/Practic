package LOOP1.Nested_LOOP;

import java.util.Scanner;
/*
1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter

            HINT: nested loop task, outter loop need to be an infinite loop
 */
public class Additional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Print two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
            System.out.println("do yuo want to continue");
            String z = input.next();

            while (!(z.equalsIgnoreCase("yes") || z.equalsIgnoreCase("no"))) {
                System.out.println("invalid number please enter yes or no");
                System.out.println("do yuo want to continue?");
                z = input.next();
            }
            if (z.equalsIgnoreCase("no")) {
                break;

            }
        }
        System.out.println("Thanks  for use our service");
        System.exit(0);
    }
}










