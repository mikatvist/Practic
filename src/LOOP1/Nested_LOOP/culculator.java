package LOOP1.Nested_LOOP;

import java.util.Scanner;

public class culculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Print two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("enter the math operator");
            char x = input.next().charAt(0);

            int result = (x=='+')? num1+num2 :(x=='-')?num1-num2:(x=='*')?num1*num2:(x=='/')?num1/num2:(x=='%')?num1%num2:0;
            System.out.println(result);
            /*switch(x){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("Invalid operator");

            }

             */

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


