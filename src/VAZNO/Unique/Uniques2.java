package VAZNO.Unique;

import java.util.Scanner;

public class Uniques2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
            // "aabcc"

        String expectedResult = ""; // "b

        for(int j = 0; j <= str.length()-1; j++){ // because we need the frequency of evry single character
            //this J represent first and last index
            // and we need to reaped this steps over and over again
// how i can get every single character by using charAt method
// doing this we can get frequency all index(character)
            char ch1 = str.charAt(j); // a a b c c
            int count1 = 0; // 1+1  // frequnecy of ch count
            for(int i = 0; i <= str.length()-1; i++){  // used for finding the frequnecy of ch and assign it to count
                // how i get every single character from String  we need to call charAt method
                // its represent  each of the character in String
                char each = str.charAt(i);  // a  a  b  c  c
                // after we ned compare ch1 with every singl
                if(ch1 == each){
                    // all time if this occurs we need counted by 1
                    count1+=1;
                }
            }
            // after this loop we need find frequency of ch1 character that occurd with the String

            if(count1 == 1 ){ // if it only occured one time
                expectedResult += ch1;// this character will be concated to this result
            }

        }

        System.out.println(expectedResult);


    }

}
