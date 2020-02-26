package day62;

import java.util.*;

public class SetOfUniqueStates {

    public static void main(String[] args) {

        // Create a set of String called states
        // add bunch of states with some duplicate
        //iterate over them using each and every way you know

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA","NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));

        //any type of collection has size method to count the item
        System.out.println("states.size() = " + states.size());

        for ( String each: states){
            System.out.println("each = " + each);
        }

        //for loops does not work !!!!! no index

        //creating iterator
//        Iterator<String> stIter= states.iterator();
//        while (stIter.hasNext()){
//            System.out.println("stIter.next() = " + stIter.next());
//        }

    //    states.forEach(each -> System.out.println("each state = " + each));

//        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after= " + states);
    }
}
