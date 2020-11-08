package String_Method1;
import java.util.Scanner;
/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.

Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.

Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
public class Find_Mid_Number_043 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
    int a = scan.nextInt();
        System.out.println("Enter second number:");
    int b = scan.nextInt();
        System.out.println("Enter third number:");
    int c = scan.nextInt();

        if( b>a && a>c || c>a && a>b ){
        System.out.println("Medium value is: "+a);
    }else if ( a>b && b>c || c>b && b>a ){
        System.out.println("Medium value is: "+b);
    }else if ( a>c && c>b || b>c && c>a ){
        System.out.println("Medium value is: "+c);
    }
}
}

