package Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Vadym", 100);
        salary.put("Marat", 120);
        salary.put("Zahar", 121);
        salary.put("Kostia", 122);
        salary.put("Maks", 80);

        for (String each : salary.keySet()){
            Integer eachValu = salary.get(each);

            if (eachValu>=80){
                System.out.println(each);
            }
          //  System.out.println(each);
        }


    }
}
