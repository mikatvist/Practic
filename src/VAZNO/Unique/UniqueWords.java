package VAZNO.Unique;

public class UniqueWords {

    public static void main(String[] args) {
        String [] word = {"C#","C#", "java", "Python", "Java"};


for (int r =0; r<= word.length-1; r++) {
    String temp = word[r];
    int count = 0;

    for (int i = 0; i <= word.length - 1; i++) {
        String each = word[i];
        if (each.equalsIgnoreCase(temp)) {
            count++;
        }
    }
    if (count == 1) {
        System.out.println(temp);
    }
}
        System.out.println("========================================================================");
        for(String each: word){
            int count = 0;
            for( String b  : word  ){ // b represents each elemnts in the array
                if(each.equals(b)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }

        }
    }
}
