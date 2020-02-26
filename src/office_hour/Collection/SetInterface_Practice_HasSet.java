package office_hour.Collection;

import java.util.*;

public class SetInterface_Practice_HasSet {

    public static void main(String[] args) {

        //collection of unique items
        //Set interface --HashSet is implementing class

        Set<Long> longSet = new HashSet<>();
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(70L);
        longSet.add(70L);
        System.out.println("longSet = " + longSet);
        System.out.println("longSet.size() = " + longSet.size());

        for (Long each : longSet){
            System.out.println(each + " ->");
        }
        longSet.addAll(Arrays.asList(2L,3L,4L,4L, 4L ));
        System.out.println("longSet = " + longSet);
        
        //Update an item -->> check whether it already exists 
        // if so remove it then add the item you want
        if(longSet.add(null)){
            longSet.remove(null);
            longSet.add(0L);
        }
        System.out.println("longSet = " + longSet);


    }
}
