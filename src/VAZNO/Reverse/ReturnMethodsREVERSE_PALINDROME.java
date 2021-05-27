package VAZNO.Reverse;

public class ReturnMethodsREVERSE_PALINDROME {

    public static void main(String[] args) {
        String name = "Level";
        // revStr1(name);
        //    System.out.println(name.equalsIgnoreCase( revStr1(name) )); // this step does not work with void method

         String reversedName = revStr2(name); // we can isagn this or
        System.out.println(name.equalsIgnoreCase(name) );

        //System.out.println( name.equalsIgnoreCase( revStr2(name) ) );

    }


   public  static void revStr1(String str){
       String result = "";       // this value i can use only in this method
       for(int i = str.length()-1; i >=0; i--){
          result += str.charAt(i);
       }
       System.out.println(result);
   }


    public  static String revStr2(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);
        }

        return  result;// i need for this return asign result this result we cn use in other place and manipulate
    }




}
