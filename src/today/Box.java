package today;

public class Box {
    double width;
    double lenght;
@Override
    public String toString () { // public String print () {
        return  "Within: " + width + ", lenght: " + lenght;
    }
    public void setInfo (double width,  double lenght){
        this.width=width;
        this.lenght=lenght;
    }
}
class UseBoxes{
    public static  void main (String[] arg){
        Box box = new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}
