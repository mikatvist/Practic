package String_Method1;

import java.util.Scanner;

public class print_ionger70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();



        if (word1.length() > word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }


    }
}
