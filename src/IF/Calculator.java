package IF;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number");
        double n1 = scan.nextDouble();
        System.out.println("enter your operator");
        char oper = scan.next().charAt(0);

        System.out.println("enter your second number");
        double n2 = scan.nextDouble();

        boolean valid = oper=='*'||oper=='/'||oper=='%'||oper=='+'||oper=='-';

        if (valid){
            switch (oper){
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                case '%':
                    System.out.println(n1%n2);
                    break;
                case '+':
                    System.out.println(n1+n2);
                    break;
                default:
                    System.out.println(n1-n2);

            }

        }else{
            System.out.println("invalid operator");
        }

    }
}
