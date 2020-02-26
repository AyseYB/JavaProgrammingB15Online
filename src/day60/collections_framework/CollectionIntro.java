package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {

    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set , Queue , List have in common
        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll(names); // addAll method parameter type is Collection (interface) so we can pass anything IS-A Collection

       // names.remove("Hasan");

        // removeAll can be used to remove many items at the same time
        // removeAll expect another Collection object
        names.removeAll(Arrays.asList("Hasan"));

        //quickly generating a type of list object and assign it to super type collection
        Collection<String> toRemoveList = Arrays.asList("Abdullo");
        names.removeAll(toRemoveList);



//        System.out.println("names = " + names);
//
//
//        for (String each  : names ){
//            System.out.println("each name = " + each);
//        }



       // System.out.println("first item " + names.get(0));

        // OPTIONALLY : THIS IS HOW WE CAN USE forEach method to print out everything in one shot
        names.forEach(each -> System.out.println("each = " + each));


    }
}

/*
 * The word Collection everywhere :
 *
 *
 * Collection Framework -->> referring entire things , entire topic
 *
 * Collection Interface --->> one interface under the entire Collection Framework
 *
 * Collections class  -->> (it has s at the end, just like Array and Arrays )
 *                   -->>  is a utility class with many static methods
 *                 for example : Collections.sort(your collection object1)
 *
 *
 * */
