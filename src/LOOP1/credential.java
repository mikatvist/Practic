package LOOP1;

import java.util.Scanner;

public class credential {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String use = scan.nextLine();
        System.out.println("Enter your password: ");
        String pas = scan.nextLine();
        int count =0;
        while (!(use.equalsIgnoreCase("cyber")&&pas.equalsIgnoreCase("tek12"))){
            if (count==3){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("INVALID");
            System.out.println("Enter your user name");

            use=scan.nextLine();
            System.out.println("Enter your password");
            pas=scan.nextLine();

            count++;

            }



        System.out.println("logged in");


    }
}
