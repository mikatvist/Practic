package today;
import java.util.Scanner;
public class personalInfo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");

        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean mar = scan.nextBoolean();

        String phone123 = "Contacts: work phone number - " + workPhoneNumber+ ", personal phone number - " +personalPhoneNumber+", email: "+email;
        String fullName = "Full name: "+ lastName+ ", "+firstName ;
        String address = "Address: "+street+", "+city+", "+state +" "+zipCode;
        System.out.println("\nPatient personal information"+ "\n"+fullName +"\n"+ address+ "\n" + phone123 +"\nAge: " +age +"\nHeight: "+ height+ "\nWeight: "+weight+" pounds"+"\nMarried?: " +mar );


    }
}