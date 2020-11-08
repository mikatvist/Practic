package LOOP1.Nested_LOOP;



import java.util.Scanner;

public class nestedLoop_Additional_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;
        int i = 0;
        while (true) {


            System.out.println("enter two numbers");
            double num1 = scan.nextInt();
            double num2 = scan.nextInt();
            System.out.println("Enter the math operator");
            char z = scan.next().charAt(0);

            switch (z){
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
                default:
                    System.out.println("Invalid Operator");
            }

           // double result = (z=='+')? num1+num2: (z=='-')? num1-num2:(z=='*')?num1*num2:(z=='/')?num1/num2:(z=='%')?num1%num2:0;


           // System.out.println(result);
            System.out.println("do you want to continue?");
            String a = scan.next();

                while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                    if (count==1 ){

                        System.exit(0);
                    }
                    System.out.println("invalid number please enter yes or no");
                    System.out.println("Do you want to continue");
                    a = scan.next();

                    count++;
                }


            if (a.equalsIgnoreCase("no")){
                break;
            }
        }
    }


}
