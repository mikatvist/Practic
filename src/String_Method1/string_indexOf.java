package String_Method1;
/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */
public class string_indexOf {
    public static void main(String[] args) {
        String txt = "foo bar";
        int b1 = txt.indexOf("b");
        int f =txt.indexOf("foo");

        System.out.print(b1);
        System.out.print(f);
    }

}
