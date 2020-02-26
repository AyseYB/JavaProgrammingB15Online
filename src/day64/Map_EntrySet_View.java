package day64;
import java.util.*;
public class Map_EntrySet_View {

    public static void main(String[] args) {

        Map<String , Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        for ( Map.Entry<String, Double> each  :  entryView){
            System.out.println("Key for current Entry is  = " + each.getKey());
            System.out.println("Value for current Entry is  = " + each.getValue());
            //update the value of grocery to $10 if the grocery name has exact 5 character
            if(each.getKey().length() == 5){
                each.setValue(15.0);
            }
        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
