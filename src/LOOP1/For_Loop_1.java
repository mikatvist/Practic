package LOOP1;
/*
nstructions from your teacher:
  Inputs:
String word;

Write a for loop that will loop through every character of a word and print out each
 character, each on a separate line

 Sample inputs/outputs:
In: hello
h
e
l
l
o

 */
import java.util.Scanner;

public class For_Loop_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        //String Str= "";
        for(int i = 0; i <=word.length()-1; i++ ){
           // String s =""+ word.charAt(i);
           char Str =  word.charAt(i);
            System.out.println(Str);



    }
       // for (char i = 0; i<= word.length(); i++){
            ;
          //
      //  }
}
}

