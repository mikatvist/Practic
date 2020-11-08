package String_Method1;

import java.util.Scanner;

/*
In this task, you need to swap first name with last name in the email. If email doesn't
 contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class Email_1_076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (!email.contains("_")) {
            System.out.println(email);
        } else {


            String m = email.substring(0, email.indexOf("_"));
            String t = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            System.out.println(t + "_" + m + "@gmail.com");
        }
    }
}
