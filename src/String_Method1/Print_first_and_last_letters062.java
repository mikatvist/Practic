package String_Method1;

import java.util.Scanner;

public class Print_first_and_last_letters062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
       // System.out.println(""+word.charAt( word.length()-1) );
       // System.out.println(word.substring(1, word.length()-1));
        int result = word.length()-1;
        System.out.println(""+word.charAt(0)+word.charAt(result));
    }
}
