package VAZNO.MAX_NUMBER;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Max_NUMBER_While {
    public static void main(String[] args) {


// 1. write a program that asks user to enter 5 numbers and returns the maximum number
        Scanner scan = new Scanner(System.in);
// we have  couple step for the repeat. for this case  we can apply loop.
        int max = -2147483648;  // -100 //we declare variable outside the loop and we put minimum number integer have
// we need to use scanner   for repeat them   5 times
        // we declare loop for this case we need to use for loop (because we now execution how many times.
        for (int i = 10; i <= 50; i += 10) {//i i start from 10 and give less and equal 50, and i need encreaze or 5 times (10)

            System.out.println("Enter a number");
            int num = scan.nextInt(); //this is step for repeat and we place in the body LOOP

            if (num > max) { // and now we put the if condition were we put user input number is greater to variable  max
                max = num;// i assign max to the num
                // in this part only greater for the max assign to this part
            }

        }

        System.out.println("Max number: " + max);
    }

}




