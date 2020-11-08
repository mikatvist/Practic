package today;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String word = scan.nextLine();
       char ch = scan.next().charAt(0);
       int count = 0;
       for (int i = 0; i<=word.length()-1; i ++){
           char each = word.charAt(i);
           if (each==ch){
               count++;
           }
       }
        System.out.println(count);

    }
}
