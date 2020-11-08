package String_Method1;
/*
as Alejandro is time is precious and even with his little knowledge of programming he
managed to save some time. but still he had a lot of emails to read.

he wants to add more conditions to his program, he wants only job related mails so he
 will narrow it down by also checking if the word "project" also appears beside his name,
  that way he will be sure its a job email that refers to him.

for example:
a = "dear alejandro.....alot of text"
outputs: "dont read"
a = "thunder blaz is the best drink in the galaxy..."
outputs: "dont read"
a = "subject : important project, alejandro we refer to you  this ...."
outputs: "read this mail"

 */
import java.util.Scanner;
public class alejandro_II_075 {
    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);
       // String a = s.nextLine();
String a = "subject : important project, alejandro we refer to you  this ....";
        //your code here

        String b = "alejandro";
        String c = "project";


        if (a.contains(b) && a.contains(c)){
            System.out.println("read this mail");


        }else{
            System.out.println("don't read");
        }

    }
}

