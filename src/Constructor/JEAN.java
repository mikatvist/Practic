package Constructor;

public class JEAN {
    static String studentName = "MIRA";
    static {
        studentName  = "Jordan";
    }

    public static void main(String[] args) {
        //studentName = "Jean";
        System.out.println(studentName);
    }
}
