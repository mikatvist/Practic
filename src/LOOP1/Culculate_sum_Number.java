package LOOP1;

import java.util.Scanner;

/*Warmup tasks:1.  Write a program that calculates the sum of numbers entered by
the user until user enters a negative number.
hint: you need an infinite loop
 */
public class Culculate_sum_Number {
    public static void main(String[] args) {
        // first lets go declare a scanner
        Scanner scan = new Scanner(System.in);
        // i need create  a loop what execute  infenetly times (never stop)
        int sum = 0; // i need add  variable sum. you no need this repeat it and we use this outside the loop

        for(int i = 0; i < 100; ){ // if i want to repet
            System.out.println("Enter a number: ");
            int num =   scan.nextInt();


            if(num<0){ // this means negative number
                break; // i should just exit to loop by given break statement
                //if the number negative break statement exicuting loop

            }

            sum += num; // othervise i should variable "sum" increze by user input "num'


        }

        System.out.println("sum is: "+sum);




    }

}

