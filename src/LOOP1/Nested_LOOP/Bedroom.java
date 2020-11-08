package LOOP1.Nested_LOOP;

import java.util.Scanner;

public class Bedroom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total =0;
        System.out.println("welcome to shop:  ");

        while (true){
            System.out.println("Please choose from the following ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $110");
            System.out.println("3. Twin Bed: $100");
            int choose = scan.nextInt();

           // choose = (choose==1)? total+=120 :(choose==2)?total+=110:(choose==3)?total+=100:0;
            switch (choose) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

                default:
                    System.out.println("Get Out");
                    System.exit(0);
            }




            System.out.println("do you want to reserve another room");
            String a = scan.next().toLowerCase();
            if (!(a.equals("yes")||a.equals("no"))){
                System.out.println("Please re-enter");
                System.out.println("do you want to reserve another room");
                a=scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }

        }
        System.out.println("your total " + total );



    }
}
