package String_Method1;

import java.util.Scanner;

/*
Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
 */
public class Verify_contains058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        System.out.println(sentence.contains(word));
    }
}
