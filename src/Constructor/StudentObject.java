package Constructor;

public class StudentObject {
    public static void main(String[] args) {
        Student stud1 = new Student("mike", 18, 'M');
        Student stud2 = new Student("Zlob", 23, 'Z');

//        stud1.setInfo("mike", 18, 'M');
//        stud2.setInfo("Zlob", 23, 'Z');
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
