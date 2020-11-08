package String_Method1;

import java.util.Scanner;

public class string_no_end_072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        System.out.println(txt.substring(0, txt.length()-1));
    }
}
