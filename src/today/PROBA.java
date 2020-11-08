package today;

import java.util.Scanner;

public class PROBA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int character = 3;

        for (int i = 0; i <= word.length() - character; i ++){
            String catdog = word.substring(i, i+character);
           // word+=word.charAt(i);



            if (catdog.equals("cat")){
                countOfCats++;
            }else if (catdog.equals("dog")){
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);
    }
}
