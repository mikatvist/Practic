package String_Method1;
/*
  The variable "name" holds a String user input

Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student
 */
import java.util.Scanner;

public class Conditional_Statement_Practice3_048 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();

       // int a = name.length()-1;

        if (name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }



    }
}
