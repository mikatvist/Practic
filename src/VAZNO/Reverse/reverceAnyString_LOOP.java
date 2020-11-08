package VAZNO.Reverse;

import javafx.beans.binding.When;

import java.util.Scanner;

public class reverceAnyString_LOOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tour word: ");
        String word = scan.nextLine();

        String result = " "; // <--i need to create  variable when i can store this accepted result
      //  String result = ""+ word.charAt(word.length()-1); //dont forget concat "" mt string <- this char return me
                                                          // last character
        for (int i = word.length()-1; i >= 0; i--){ // we have the loop that can give from the last index to index 0
            //When the loop first executed, what the value the (i)? it is last index in our word (example "M").
            // what character will be retrieve from the String, its for example word "M" because charAt method
            // concat to the string  "result". after decrement When loop  executed second time index give us
            // for example index "4"in charAt method it will be character "Y"and concat for the "result"
            result += word.charAt(i); // we apply concatination and concate charAt method


        }
        System.out.println(result);
    }




}
