package Static;

public class circle {
    double radius;
    double diameter;
    static double pi = 3.14;

    public void setInfo(double radius){
        this.radius=radius;
        diameter=radius*2;
         }
         public double calcArea(){
        return  radius*radius*pi;
         }
         public double calcParameter(){
        return diameter*pi;
    }
    public String toString (){
        return  "The area of the cicle with the radius"+radius+" is : "+ calcArea();

    }
}
