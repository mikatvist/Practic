package String_Method1;

import java.util.Scanner;

public class Reverse_it67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        // boolean result = first.length() == 5 && second.length() == 5;
        String result = "";
        if (word.length() == 5) {
            for (int i = word.length() - 1; i >= 0; i--) { //i: 4, 3, 2, 1, 0
                result += word.charAt(i);
            }
            System.out.println(result);

        }else if( word.length() < 5){
            System.out.println("Too short!");
        }else  if (word.length() > 5){
            System.out.println("Too long!");
        }
    }
}
