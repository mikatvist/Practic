package VAZNO.Frequency_of_Characters;

public class FRequencyCustomMethodForEachLoop {
    /*
1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2

			Note: MUST use Arrays and for each loop
 */


    public static void main(String[] args) {

        String str = "Aaabcccdefffffjkkkkkkkl";

        String uniques = "";
        for(char each  : str.toCharArray() ){ // this loop responsibility every single character
  // (each of the element this is char. and convert str to the char.Array method(every single character of thr string will be char array)
            int count =frequency(str, each);// then we have method to give frequency and sign to this method
            if(count == 1){ // then we have this if statement to checkif character is unique or not
                uniques += each; // if thit unique this contains (STRING UNIQUE)
            }
        }

        System.out.println(uniques);
    }



// this method suppost to be 1 String and 1 char
    //1. and check how many time CHAR character occurs in the String
    //1. which means can i check  compary every singl character with every singl character in the string
    //2. and i need to be counted so i can return frequency letter
    // 3. if i want use frequency letter my return type should be datatype
    //4. if i want return the number return type should be int
    public static int frequency(String str, char ch){ // finds the frequency of char from string str
        int count = 0;
        //way to create char in array by using toCharArray method
        //left side we provide every singl element in array
        for(char each  : str.toCharArray() ){
            //each-each character in the string
            if(each == ch){
                count++;
            }
        }
//
        return count;
    }
    public static String unique (String str){
        String uniques = "";
        for(char each  : str.toCharArray() ){ // this loop responsibility every single character
            // (each of the element this is char. and convert str to the char.Array method(every single character of thr string will be char array)
            int count =frequency(str, each);// then we have method to give frequency and sign to this method
            if(count == 1){ // then we have this if statement to check if character is unique or not
                uniques += each; // if thit unique this contains (STRING UNIQUE)
            }
        }
        return uniques;
    }
}
