package LOOP1;
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
public class Print_odd_numbers {
    public static void main(String[] args) {
        for (int i = 11; i<=121; i++){
            if(i%2==0){
                continue;

            }
            System.out.print(i+" ");
        }
    }
}
