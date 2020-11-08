package String_Method1;

public class self_2 {
        public static void main(String[] args) {
            String input = "Canada Alberta";

            System.out.println(input.charAt(5));
            System.out.println(input.length());
            System.out.println(input.concat(" / Alberta"));
            System.out.println(input.toLowerCase());
            System.out.println(input.toUpperCase());
            System.out.println(input.trim());
            System.out.println(input.substring(0,4));
            System.out.println(input.replace("Can","Man"));
            System.out.println(input.replaceFirst("C","L"));
            System.out.println(input.indexOf("t"));
            System.out.println(input.lastIndexOf("a"));
            System.out.println(input.isEmpty());
            System.out.println(input.equals("canada Alberta"));
            System.out.println(input.equalsIgnoreCase("CANADA ALBERTA"));
            System.out.println(input.contains("Alberta"));
            System.out.println(input.startsWith("Finland"));
            System.out.println(input.endsWith("ta"));
        }
    }

