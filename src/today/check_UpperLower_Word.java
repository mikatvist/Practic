package today;

import java.util.Scanner;

public class check_UpperLower_Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter a sting");
        String word = scan.next();

        //first  we are  use charAt method for the find first character
        // and we are asign for char variable
        char first1 = word.charAt(0);
        //after we need to fin last character to word
        // we call charAt method and provide last index number with method length()-1
        char first2 = word.charAt(word.length()-1);
        //next what i need to do this is check first character is thi Uppercase
        // for this we create to boolean variable for start and and word
        //first create boolean condition for the starting way within to uppercase
        boolean start = first1 >='A'&& first1<='Z'; // condition for uppercase characters
        // if this boolean is tru word starts with uppercase

        boolean end = first2>='a'&& first2<= 'z';// this expresions for lower case
        // both this condition must be true

        System.out.println(start&&end);
    }
}
