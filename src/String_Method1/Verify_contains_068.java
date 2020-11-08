package String_Method1;
/*
Write a program that will verify if word contains in the sentence.
 Print out the result as boolean value.
 */
import java.util.Scanner;
public class Verify_contains_068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        System.out.println(sentence.contains(word));
    }
}
