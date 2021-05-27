package VAZNO.MAX_NUMBER;

import java.util.Arrays;

public class ReturnMethodsMAX_MIN {


    public static void main(String[] args) {
            int[] arr = {100, 200, 50, 40, 60};
            int num = max(arr);

        System.out.println(num);
        System.out.println(num > 300);

       // int num2 = max2(arr);


    }


    public static int max(int[] arr){
        Arrays.sort(arr); // sorted from smallest to larger
        int max = arr[arr.length-1]; // find last index from array
        return max;
    }


    public static void max2(int[] arr){ // as a value I can use in main method
        Arrays.sort(arr);
        int max = arr[arr.length-1];

    }


}
