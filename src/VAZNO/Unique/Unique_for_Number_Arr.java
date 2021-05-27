package VAZNO.Unique;

public class Unique_for_Number_Arr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3,}; // i need verify is firs arr element is unique or not and i need to verify every single element
        // how i can retrieve this first element from this array?
        //1. we put arr veriable and inside first index
        //2. i need find frequency [1] of all arr (how many time this occur)

        //8.but this all steps we need to reaped  for every single elements this arr.How we do this?
        // just use for loop
        for (int q = 0; q <= arr.length - 1; q++) {
            // and in the arr we need put [q]

            int num1 = arr[q];//1
            //3. for this we need place for the count and store frequency number of arr
            int count = 0;
            //4.how do you find frequency (num1)?//using the loop compere with elements

            for (int i = 0; i <= arr.length - 1; i++) { //only calculates the frequnency of num
                //5. [i] represent every singl element of the arr. how we retrieve? by give index number.
                // this return the integer and you can sign to the int veriable

                int each = arr[i]; //1 1 2 3 3//this loop executed 5 times
                //6. all i have to do is(find frequency of NUM1) just find how many times this num1 muching in (each) variable
                // and i need to able counted frequency
                //for  this we are create if condition
                if (each == num1) {
                    count++;


                }

            }
            //7. if this first elemrnt unique i need print, how we do this  pu in if
            if (count == 1) {
                System.out.println(num1 + "");
            }
        }

        for(int a: arr){
            int count = 0 ;
            for(int b: arr){  // only calculates the frequnecy of num
                if(b == a){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a+" ");
            }
        }
    }

}