package LOOP1;

import java.util.Scanner;

/*you get a number, write a code that draws a rectangle outline the size of that number.
        each rectangle row is 3 x: xxx
        inner rect row is "x  x"

        for example:

        n = 2

        xxx
        x  x
        x  x
        xxx


        n=3

        xxx
        x  x
        x  x
        x  x
        xxx

 */
public class loop_draw_rect_outline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String q = "x x";

        System.out.println("xxx");
        for (int i = 1; i <= n; i++) {

            System.out.println(q);

        }
        System.out.println("xxx");
    }
}
