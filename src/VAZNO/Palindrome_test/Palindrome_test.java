package VAZNO.Palindrome_test;

import java.util.Scanner;

public class Palindrome_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word: ");
        String palindrome = scan.nextLine();
        //first we can use existing String and after we apply Scanner
        // after we need verify this palindrome or not
        // we need to able be reverse
        // we need to store reverse word to the String
        String reverseWord = ""; //for this variable we put reverse version
        //what the logic to reverse our String? I think we nee to apply  the LOOP
        for (int i = palindrome.length() - 1; i >= 0; i--) { // we have the loop that can give start from the last index to index 0
            // i should start from last index in the word. if i dont know end words i need start with method
            // length() and subtrac  -1. My condition should  be less end 0. in my iterator i should go back word, its
            // means you need  decrease the value
            // for now "I" its represent my index numbers,So by using this "I" I may can able to get every single
            // character from  the String "palindrome" and concate to String "reverseWord".
            // we need to use charAt method and pass variable "I" for represent each character
            // for this we need use additional asign operator "+="

            reverseWord += palindrome.charAt(i); // we apply concatination and concate charAt method
            //also i can use substring method get each of the character
            //reverseWord += palindrome.substring(i, i+1);//for the begin i give "I" for the end  "I+1" give us same result
        }
        System.out.println(reverseWord);
        // what i need to do check if this palindrome true or false?
        // right here what i need to do give boolean
        System.out.println(palindrome.equals(reverseWord));

    }
}
