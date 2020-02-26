package day64;
import java.util.*;
public class Map_ValuesView2 {

    public static void main(String[] args) {

        Map<String , Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Collection<Double> allPrice = groceryPriceMap.values();

        //remove all entry of the groceryPriceMap if the price value is more than 3
        allPrice.removeIf(eachPrice -> eachPrice>3);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        //the logic is to use the strict connection between the view and the original map
        //iterate over the allPrices and check the condition for more than 3 or not
        // if it is more than 3 then remove
        // cannot remove elements inside for each loop
        // so only

        Iterator<Double> itr = allPrice.iterator();
        while (itr.hasNext()){
            if(itr.next() >3){
                itr.remove();
            }
        }
        System.out.println("allPrice = " + allPrice);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}


