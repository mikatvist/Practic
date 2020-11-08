package VAZNO.Reverse;

public class reverseWhileloop {
    public static void main(String[] args) {
        String str = "Cybertek School";
        //            01234567

        String result = "";// we need to great variable to represent  last character
        // we declare a variable that represent my declare number
        //and start with last index number and Asign to the variable
        int index = str.length() -1;
        //in while loop we create a condition to indicate ending  point
        while(index >= 0){//we need in the condition declare variable "Index"

            result += str.charAt(index);
        // for now this condition run for infinet time
            index--;
        }


        System.out.println(result);

    }
}
