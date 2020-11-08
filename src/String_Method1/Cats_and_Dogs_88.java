package String_Method1;
import java.util.Scanner;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given
 string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */

public class  Cats_and_Dogs_88 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

       int character = 3;

       for( int i = 0; i <= word.length()-character; i++){

           String fun = word.substring(i, i+character);

           if (fun.equals("cat")){
               countOfCats++;
           }else if(fun.equals("dog")){
               countOfDogs++;
           }
       }
        System.out.println(countOfCats== countOfDogs);

    }
}