package LOOP1;

import java.util.Scanner;

/*
you get a number, write a code that draws a filled rectangle the size of that number.
each rectangle row is 3 x: xxx

for example:

n = 2

xxx
xxx


n=3
xxx
xxx
xxx
 */
public class loop_draw_rect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String q = "xxx";



        for (int i = 1; i <= n; i++) {

            System.out.println( q);
        }
    }
}