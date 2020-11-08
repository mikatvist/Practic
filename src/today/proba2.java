package today;


import java.util.*;



public class proba2 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name1 = scan.nextLine();

        /*if (name1.contains("gmail")){
            System.out.println("gmail");
        }else if (name1.contains("yahoo")){
            System.out.println("yahoo");

         */

            //or
            int index1 = name1.indexOf('@');
            int index2 = name1.lastIndexOf('.');

            String res = name1.substring(index1+1,index2);
        System.out.println(res);


        }


       // System.out.println("Enter yor second name: ");
        //String name2 = scan.nextLine();



       /* Warmup tasks1.
        write a program that asks user's first and last name, then prints out the initials of the userinput:
    cybertek batch18output:your initial is: CB
        DO NOT use charAt method
        String a = name1.substring(0,1);
        String b = name2.substring(0,1);

        System.out.println(a.toUpperCase()+"\n"+b.toUpperCase());

        */

        /*int b = name1.length()-1;
        String z=name1.substring(3,name1.length());
        System.out.println(z);

         */
        /*
        String fullName = name1.concat( " "+name2);
        fullName=fullName.toUpperCase();
        System.out.println("Your full name: " +fullName);

      */
        //char z = name1.charAt(0);



      //int c = name1.length()-1;
        //System.out.println(""+z+name1.charAt(c));



    }







