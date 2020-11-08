package today;

import java.util.Scanner;

public class PROBA_STRING {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = scan.nextLine();

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }


/*
        if (word1.endsWith("@gmail.com")){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

 */

/*
        boolean result = word1.length()==5 && word2.length() == 5;

        if (result){
            if (word1.endsWith(""+word2.charAt(0))&& (word2.startsWith(""+word1.charAt(word1.length()-1)))){
                System.out.println("Bizz");
            }else {
                System.out.println("Quezz");
            }
        }else{
            System.out.println("words more 5 ");
        }

 */

      /* char first = word2.charAt(0);
       char last = word1.charAt(word1.length()-1);
       // String last = word1.endsWith();
       // String first = word2.startsWith();

        if (result){
            if(first==last){
                System.out.println("Bizz");
            }else{
                System.out.println("Quizzz");
            }

        }else{
            System.out.println("invalid");
        }

       */




       // System.out.println("Enter the third word: ");
        //String word3 = scan.nextLine();

        //1 word1 = word1.replace("a","");
       // 1 System.out.println(word1);

       /* 2 if(word1.length()==word2.length() && word1.length()==word3.length() && word2.length()==word3.length()){
            System.out.println("all words same length ");
        } else if (word1.length()==word2.length() || word1.length()==word3.length() || word2.length()==word3.length()){
            System.out.println("not same not different ");
        }else{
            System.out.println("all different length");
        }
        /*
         3 if(word1.length()==0){
            System.out.println("Empty");
        }else if(word1.length() >= 3) {
            System.out.println(word1.substring(word1.length()-3));
        }else{
            System.out.println(word1);
        }

         */
      //  4 String result = (word1.length()==0)? "Empty" : (word1.length() >= 3)? word1.substring(word1.length()-3): word1;
       // System.out.println(result);



        /*
        5 char wordFirst= word1.charAt(0);
        char wordLast = word1.charAt(word1.length()-1);
       // System.out.println(""+wordFirst + wordLast );
        if (wordFirst==wordLast){
            System.out.println();
        }else{
            System.out.println();
        }

         */
    }
}
