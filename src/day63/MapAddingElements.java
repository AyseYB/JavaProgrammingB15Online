package day63;

import java.util.*;

public class MapAddingElements {

    public static void main(String[] args) {

//        Map<String , Integer> nameAndAgePair = new HashMap<>();
//
//        //adding elemenets : put
//
//        nameAndAgePair.put("Zehra" , 6);
//        nameAndAgePair.put("Muhammed" , 21);
//        nameAndAgePair.put("Maiia", 27);
//        nameAndAgePair.put("Aidar" , 20);
//        nameAndAgePair.put("Fatih" , 27);
//        nameAndAgePair.put("Raksana", 16);
//        //the keys of the map is uniqe, it does not accept duplicate
//        // here since we already have Zehra ---> it will just replace the old value with new one
//        nameAndAgePair.put("Zehra", 7);
//        // how do i only add new items if it does not already exist (java 8 addition)
//        nameAndAgePair.putIfAbsent("Zehra", 10);
//
//        System.out.println("nameAndAgePair = " + nameAndAgePair);
//
//        System.out.println("nameAndAgePair.size() = " + nameAndAgePair.size());
//
//        System.out.println("Zehra's age = " + nameAndAgePair.get("Zehra"));
//
//        //how do i check a key already exist or not
//        System.out.println("nameAndAgePair.containsKey(\"Raksana\") = " + nameAndAgePair.containsKey("Raksana"));
//        System.out.println("nameAndAgePair.containsKey(\"Hasan\") = " + nameAndAgePair.containsKey("Hasan"));
//
//        //updating the element in the map using replace
//        nameAndAgePair.replace("Maiia", 17);
//        System.out.println("nameAndAgePair.get(\"Maiia\") = " + nameAndAgePair.get("Maiia"));
//        //why dont we just use put ?? what is the downside?
//        //if i dont have that key it will just add new one, that's not we want, we only want to update
//
//        //updating the value only if the old value equals to a specified value
//        nameAndAgePair.replace("Zehra", 7, 9);
//        System.out.println("nameAndAgePair.get(\"Zehra\") = " + nameAndAgePair.get("Zehra"));
//
//        nameAndAgePair.remove("Fatih");
//       // System.out.println("nameAndAgePair.get(\"Fatih\") = " + nameAndAgePair.get("Fatih"));
//        System.out.println("nameAndAgePair = " + nameAndAgePair);
//
        //=====================================================================
        Map<String, Double> itemAndPricePair = new HashMap<>();
        itemAndPricePair.put("Cereal", 4.99);
        itemAndPricePair.put("Cheese", 6.99);
        itemAndPricePair.put("Milk", 7.99);
        itemAndPricePair.put("Eggs", 4.99);
        itemAndPricePair.put("Apples", 2.99);
        itemAndPricePair.put("YOgurt", 4.99);
        itemAndPricePair.put("Ice cream", 5.99);

        itemAndPricePair.put("Ice cream", 5.99);
        itemAndPricePair.putIfAbsent("banana", 0.99);
        System.out.println("itemAndPricePair = " + itemAndPricePair);
        System.out.println("itemAndPricePair.get(\"Eggs\") = " + itemAndPricePair.get("Eggs"));
        System.out.println("itemAndPricePair.size() = " + itemAndPricePair.size());

        //System.out.println("itemAndPricePair.replace(\"Apple\", 2.99*2) = " + itemAndPricePair.replace("Apple", 2.99 * 2));
        itemAndPricePair.replace(("Apple") , itemAndPricePair.get("Apple")*2);
        System.out.println(itemAndPricePair.get("Apple"));


    }
}
