package String_Method1;

import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name:");
        String word = scan.next();
        int result = word.length();
        System.out.println(result);
    }
}
