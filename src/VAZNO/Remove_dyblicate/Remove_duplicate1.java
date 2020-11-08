package VAZNO.Remove_dyblicate;

import java.util.Scanner;

public class Remove_duplicate1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();  //"ab"
        //            0123
        //we declare mt string
        String result = ""; // "abcdefghi"
        // we need check every single character one by one
        // when we ably check every single character we need check every single index
        // this steps repeated multi pull time for this we create a loop

        /*
        for(int i = 0; i <= str.length()-1; i++  ){

              String s =  ""+str.charAt(i); // a, a, b, b // get each of the character one by one we need use
                                                          //charAt method from String str
                // what i need to do next this "s" i need to added to the "result"
                // how i can give condition contained but noy dublicat in the "result"
                // we need give IF condition

                if( result.contains(s) ){  // if the character is already contained in result, wre will not add it again
                   continue;
                }

                result += s;

        }
    */

        for(int i = 0; i <= str.length()-1; i++  ){

            //  String s =  ""+str.charAt(i);  //a,  b,  a,  b// get each of the character one by one we need use
                                                     //charAt method from String str
            // what i need to do next this "s" i need to added to the "result"
            // how i can give condition contained but noy dublicat in the "result"
            // we need give IF condition
            String s = str.substring(i, i+1);

            if( !result.contains(s) ){ // in the first execution result does not contain "a" it is TRUE if this true
                // "a" will be concat to the result. When the loop executed second time we have still "a"  if result
                //again does not contain "a" is FALSE and it not concat to the result. When loop executed third time
                // the value will be "b" compailer check If condition. The result does not contain "b" is TRUE if this true "b"
                // will be added.
                result += s;
            }

        }

        System.out.println(result); // at the and we need t print our result



    }

}
