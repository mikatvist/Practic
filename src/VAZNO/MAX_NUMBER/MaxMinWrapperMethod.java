package VAZNO.MAX_NUMBER;


import java.util.Scanner;

public  class MaxMinWrapperMethod {
    private static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int  i = 1; i <= 5; i++){
            System.out.println("enter number");
            int f = scan.nextInt();
           if (f>max){
               max=f;
            }
           if (f<min){
               min=f;
           }
        }
        System.out.println(max);
        System.out.println(min);


    }

}
