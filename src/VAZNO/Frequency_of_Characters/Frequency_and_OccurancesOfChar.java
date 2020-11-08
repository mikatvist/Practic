package VAZNO.Frequency_of_Characters;

import java.util.Scanner;

public class Frequency_and_OccurancesOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your String: ");
        String word = scan.nextLine();
        System.out.println("Write your character: ");
        char char1 =scan.next().charAt(0); // if i use next method its return me just String but we can call charAt method
        // for only  first character charAt(0)
        int count = 0;

        // first we need to comailer character with the all string
        //for this the better use for loop when eterete every single index of string
        for (int i = 0; i <= word.length()-1; i++){
            //after we need get each of the character in the String  by using charAt method
            char each = word.charAt(i);//this i return me each of the character from the string
            // next what i need to do during put equal to the one character, and i can say this char is occur
           // for this condition we need to create if Statement
           // if (char1.equals(each)){
            if (each==char1){

                // when this occur i need to be account by1 for this we need another variable witch helps me to
                // find frequency  before for loop we create new variable   int count = 0;
                count += 1;
            }
                   }


        // while LOOP
        /*int i =0;
        while (i<=word.length()-1){
            char each = word.charAt(i);
            if (each==char1) {
                count += 1;
            }
            i++;
        }

         */
        System.out.println(count);
        }
}
