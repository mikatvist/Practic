package VAZNO.Reverse;
/*
2.  write a program that can reverse the following string:String str = "Java";
output: avaJplease provide two solutions:
first solution, you MUST use substring method
second solution, you MUST use charAt method
 */
public class reverse_First1 {
    public static void main(String[] args) {
        String str = "Java"; //if this is string
                            // how can i get this result " avaJ "
        //we can great 2 String "ava" "J"
        // how i can retrieve this text by using substring method

        // i need to sign to variable and  give the beginning index and end index
        String w1 = str.substring(1);

        //after i need retrieve first character
        //we gives first and end index
        String w2 = str.substring(0,1);//this substring method return me "J"

        //how can i get this output now --> "avaJ"
        //we need concat it by assign to the variable call result1
        String result1 = w1+w2;
        System.out.println(result1);//expected result is

    }
}
