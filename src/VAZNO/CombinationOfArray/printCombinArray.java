package VAZNO.CombinationOfArray;

import java.util.Arrays;

public class printCombinArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);
    }
    public static void combine2Arrays(int[] arr1, int[] arr2){
        // we need to combine them with size  and put another arr after 1. for this we use new keyword
        int[] arr3 = new int[arr1.length + arr2.length];
// if we want to isang ech element we need use for each loop for the first arr
        //we need create and declare variable wich represent index. and start from 0
        int i = 0;
        for(int each  :  arr1){
            //firs element we need asign to index  0 second to 1... arr3
            //each represent element asign for the arr3 and passing index number this represent [i]-begin 0

            arr3[i] = each;
            i++;
        }
    // this for the second arr2
        for(int each : arr2){
            arr3[i]= each;

            i++;
        }

        System.out.println( Arrays.toString(arr3));

    }

}
