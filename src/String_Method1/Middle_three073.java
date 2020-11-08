package String_Method1;
/*
Instructions from your teacher:
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
import java.util.Scanner;
public class Middle_three073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int number = word.length();
        int center = number/2;
        if (number%2==0 ||number<5 ){
            System.out.println("invalid");
        }else{
            String result = word.substring(center -1, center+2);
            System.out.println(result);
        }
    }
}
