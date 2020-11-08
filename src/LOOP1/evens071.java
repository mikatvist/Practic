package LOOP1;
/*
Write a program that will print out even numbers from 2 to 100 through the comma.
 */
public class evens071 {
    public static void main(String[] args) {

        for (int i=2; i<=100; i++){

            if (i%2!=0){
                continue;
            }
            System.out.print(i + ",");

        }

    }
}