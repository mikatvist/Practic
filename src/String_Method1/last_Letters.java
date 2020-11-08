package String_Method1;
import java.util.Scanner;
public class last_Letters {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String word = scan.next();

        int lastIndexNumber = word.length() - 1;

        char lastChar = word.charAt(lastIndexNumber);
        System.out.println(lastChar);
        System.out.println(scan.nextLine ());
    //String lastCharacter = word.substring(word.length()-1);
      //      System.out.println(lastCharacter);



            //   OR System.out.println(word.substring(word.length()-1));
        // or
}
}