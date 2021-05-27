package Constructor;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    static String company = "Jonson and Jonson";

    public Item(String name,double unitPrice,int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return  unitPrice * quantity;
    }

    public String toString(){
        return "name: "+ name + "\n unitPrice: "+ unitPrice+ "\n quantity"+ quantity +"\n" + company + "\n Total Price:  "+ calcCost();
    }
}
