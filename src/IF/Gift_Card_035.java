package IF;

import java.util.Scanner;

/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
 */
public class Gift_Card_035 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tovar = s.nextLine();


        int balance = 100;

        if (tovar.equals("Smartphone") || tovar.equals("Laptop")) {

            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (tovar.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 15;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (tovar.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 10;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (tovar.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 15;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (tovar.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 30;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (tovar.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 50;
            System.out.println("Your current balance is: " + balance + "$");
        }else if( tovar.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");
        }else if( tovar.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 5;
            System.out.println("Your current balance is: " + balance + "$");
        }else if( tovar.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");
        }else if( tovar.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 40;
            System.out.println("Your current balance is: " + balance + "$");
        }else{
            System.out.println("Invalid item!");
        }
}
}
