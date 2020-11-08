package VAZNO.divide_two_numbers;
/*
    4. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
               10/3 = 3
               10 - 3 = 7
               7 - 3 = 4;
               4 - 3 = 1;
               3/3
               3-3 = 0

 */
public class divide_two_numbers_without_using {
    public static void main(String[] args) {
        int a = 20; //2 // numerator
        int b = 3;  //denominator
        //
//how i can do this condition
        // first im use
        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0); // forcefully teminating the program
        }

//I should use while loop
        int count = 0; //3

        while(a >= b){ // while loop executed  3 time
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);

    }
}
