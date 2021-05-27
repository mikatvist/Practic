package VAZNO.Reverse;

import java.util.Arrays;

public class reverseArray_Method {

    public static void main(String[] args) {
        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45 };
        printDesc(arr);
    }


    public static void printDesc(int[] arr){  //{10,9,20,30,5,6,7};
        //how we print in the same line sapareted by space, what the steps we need to do
        // we have special method sort the array and  a sending order (sort method utility class) and after i pass arr

        Arrays.sort(arr); // {5, 6, 7, 9, 10, 20, 30};
    //for this we use for loop and initialization start from the end index (
        for(int i=arr.length-1; i >= 0; i-- ){
            // if we want to retrieve element from arr 1. we give arr name 2. we provide index number
            // thi is just int (element) and we no need toString method
            System.out.print(  arr[i]+" " );  // 30 20 10 9 7 6 5
        }
    // if i want my print statement from new line we give 1 more mt
        System.out.println();
    }
}


