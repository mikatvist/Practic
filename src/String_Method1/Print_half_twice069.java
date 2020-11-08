package String_Method1;

import java.util.Scanner;

public class Print_half_twice069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        int half = txt.length()/2;
        String result = txt.substring(0, half);
        //String result = (txt.length()==0) ? "empty string" : (txt.length() < 3) ? txt.substring(txt.length()-3) : txt;
        System.out.print(result);
        System.out.print(result);
    }
}
