package today;

import java.util.Scanner;

public class Proba3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result1 = scan.nextInt();

        int result = 1;
/*
        for (int i = result1; i>=1; i--){
            result = result * i;

        }

 */
        for (int i = 1; i<= result1; i++){
            result*=i;
        }
        System.out.println(result);
    }
    }

