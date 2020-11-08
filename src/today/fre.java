package today;

import java.util.Scanner;

public  class fre {
    public String name;

    }
 class Circle extends fre{
    public double radius;
}
class Main{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        fre s1 = c1;
        s1.name = "Circle";
        Circle c2 = (Circle) s1;
        c2.radius =3.1;
        fre s2 = c2;
        System.out.println(s2.radius);

    }
}
