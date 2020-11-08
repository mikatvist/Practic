package String_Method1;
import java.util.Scanner;
/*
Write a program that will print out route instructions. Your program should take 2
parameters: start point and endpoint. Use left, right, up and down for navigation. Insert
">" between commands. If start point equals to endpoint - display: "start/end(start or
end variable!) found".
Note: you may move only clockwise.
Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
public class Build_a_route080 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();


   /* if (end.equals("A")){
            System.out.println( "A found" );
        }else if(end.equals("B")){
        System.out.println("right: B found");
    }else if(end.equals("C")){
        System.out.println("right > down: C found");
    }

    */
switch (start){
    case "A":
    String e = (end.equals("A"))? "A found": (end.equals("B"))? "right: B found":
            (end.equals ("C"))? "right > down: C found":"right > down> left: D found";
    System.out.println(e);
    break;
    case"B":
        String q = (end.equals ("B"))? "B found": (end.equals ("C"))? "down: C found":
                (end.equals ("D"))? "down > left: D found":"down > left > up: A found";
        System.out.println(q);
        break;
    case"C":
        String w = (end.equals ("C"))? "C found": (end.equals("D"))? "left: D found":
                (end.equals ("A"))? "left > up: A found":"left > up > right: B found";
        System.out.println(w);
        break;
    case"D":
        String z = (end.equals ("D"))? "D found": (end.equals ("A"))? "up: A found":
                (end.equals ("B"))? "up > right: B found":"up > right > down: C found";
        System.out.println(z);
        break;
}

}
}
