package today;

import java.util.Scanner;

public class Two_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string ");
        String word = scan.nextLine();
        String st1 = word.substring(0,1);
        String st2 = word.substring(1,word.length());

        boolean start = st1 == st1.toUpperCase();
        boolean end = st2 == st2.toLowerCase();
        System.out.println(start&&end);

    }
}