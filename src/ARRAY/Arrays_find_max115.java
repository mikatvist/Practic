package ARRAY;
import java.util.Scanner;
import java.util.Arrays;
/*
Given an array num, get the max number in nums and print out to console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33


hint:
create a variable called max and before you start searching assume the first item value is the max.
loop through each and every item and check for whether the value max is less than the item value.
if so assign the value to the max to overwrite existing max.
you will get the max value when you are done with the loop
 */
public class Arrays_find_max115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int max = nums[0];

        for(int i =1; i<=nums.length -1; i++){

            if (nums[i]>max){
                max=nums[i];

            }
                    }
        System.out.println(max);
    }
}
