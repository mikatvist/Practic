package VAZNO.Unique;
/*
 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */

public class Uniques {


    public static void main(String[] args) {
        String str = "aabccdeefgghijkl";
                    // "aabcc"

        String uniques = "";  //"b" here we want to store unique String
// first i need compare every single characters for this we need just loop
                for(int i = 0; i <= str.length()-1; i++ ){
// how i can get every single character by using charAt method
             char ch = str.charAt(i);         //  a  a  b  c  c
                    //we need passed indexOf and lastIndexOf method  // its return ech index character
             int first = str.indexOf(ch);    //   0  0  2  3  3
                    //its return last character
             int last = str.lastIndexOf(ch); //   1  1  2  4  4
                    // next whay we need to do to compere this two index character if this equal this means unique character

            if(first == last){
                //we need compere this two character with adittional asign operator
                uniques += ch;
            }

        }


        System.out.println(uniques);






    }

}
