package Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {
        Item list1 = new Item("tomate", 10.00, 1);
        Item list2 = new Item("cucumber", 9.00, 2);

        ArrayList<Item>total= new ArrayList<>();
        total.addAll(Arrays.asList(list1,list2));
        double totalCost = 0;

        for (Item each :total) {
           totalCost += each.calcCost();
        }   
        

        System.out.println(totalCost);

//        System.out.println(list1);
//        System.out.println(list2);


        System.out.println("=========================================================================");
        Item[] total2 = {list1,list2};
        System.out.println(Arrays.deepToString(total2));

        double totalCost2 = 0;

        for (int i= 0; i<=total2.length-1; i++){
           totalCost2 += total2[i].calcCost();
        }
        System.out.println(totalCost2);
    }
}
