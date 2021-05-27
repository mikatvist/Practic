package Static;

public class ShapeObjects {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.setInfo(25);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcParameter());
        System.out.println(c1.toString());
    }
}
