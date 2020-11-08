package VAZNO.Frequency_of_Characters;

import java.util.Scanner;

public class Frequency_of_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your word");
        String fun = scan.nextLine();  //-1--> original string
        // first i need had letters from word how i can do this
        // by removing to dublicates from original String
        // for this we create other variable call  nonDuplicate
        String nonDuplicate = ""; // -2--> this we have after we remove to duplicate
        // and after this concate each character for frequency
        // if i want to asign expected result i need to create new veriable
        String result = " "; //-3-->and this what we have ad the end for expected result

        // first step how i can remove the duplicate from string 1 and asign to string 2
        // we need to check every single character then i need is duplicate or not
        // for this the better if i use the loop
        for (int i = 0; i <= fun.length()-1; i++){//we start from first character 0 for the end use lenght-1
            // can i retrive each character of the string
            // how can i get each of the character we can use charAt method or substring method
            String ch = ""+ fun.charAt(i);   //how many time loop executed? --- B, B, C, C, D, D
            //now we have every single character for the STRING
            // next what i need to do is create condition how we do this, use if stetement

            if(!nonDuplicate.contains(ch)){

                nonDuplicate += ch;
            }
        }
       // System.out.println(nonDuplicate); // this all UP remove duplicate from the STRING

        // next what i need to do it its works for example this result (A2B4)
        // 1. for now we need to find how much time (nonDuplicate occurs to the STRING FUN)
        // 2. we have some String with out duplication ("AB") and have STRING with duplication ("ABAB") and we need to know
        // how many time this occur
        // 5. but we have more character  for this we need create one more for LOOP for rapete ALL nonDuplicate character
        for (int e = 0; e <= nonDuplicate.length()-1; e++) {
            //3. all character we need compare with
            char ch = nonDuplicate.charAt(e);// if we  need find frequency All the character  0 we need to change e
            int count = 0;// for the count we need another variable for now this is 0 how many time is occur with original STRING
            //if this equal this will be incresed by 1

            //4. for now we need compare CHAR CH with STRING FUN(every single character)
            // FIRST for this we can apply for loop and iterete original STRING
            for (int h = 0; h<=fun.length()-1; h++ ){
                //SECOND we create IF CONDITION

                if (fun.charAt(h)==ch){ //this return each character of the String and matching with
                    // CHAR CH(that means this char is occur is STRING FUN)
                    //every time its occur i should counted
                    count++;
                }
            }
            // we can contain  everything to the RESULT
            // result += nonDuplicate.charAt(0) + count;

            System.out.print(ch+""+count);
        }




    }
}
