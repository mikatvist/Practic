package today;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class credential {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name: ");
        String userName = scan.nextLine();
        System.out.println("enter your password: ");
        String password = scan.nextLine();
        int attempt = 0;

        while (!(userName.equalsIgnoreCase("Natasha")&& password.equalsIgnoreCase("mishka"))) {
            if (attempt==2){
                System.out.println("your account is lock");
                System.exit(0);
            }
            System.out.println("Invalid user name, please reenter ");
            System.out.println("Enter your user name ");
            userName = scan.nextLine();
            System.out.println("Enter your password ");
            password = scan.nextLine();
            attempt++;




        }
        System.out.println("IN");


    }
}
