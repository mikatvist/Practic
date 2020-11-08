package LOOP1;
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
import java.util.Scanner;
public class For_Loops_vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i <= word.length(); i++) {

                char s =  word.charAt(i);
            //System.out.println(i);
                if (s == 'a' || s == 'e' || s == 'i'
                        || s == 'o' || s == 'u') {
                    System.out.print(s);
                }
            }


        }

    }




