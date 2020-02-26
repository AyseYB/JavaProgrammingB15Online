package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface2 {

    public static void main(String[] args) {

        //creating a HashSet with items already inside
        // REMEMBER : In HashSet THERE IS NO DEFINED ORDER !!!!!!!!!!!!!!!!!!!!!!
        //  YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE
        // You can use all the methods coming from Collection interface

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNums = new HashSet<>(numList);
        System.out.println("myNums = " + myNums);

        // Create a set of String called states
        // add bunch of states with some duplicate
        //iterate over them using each and every way you know

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA","NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
        states.remove("GA");
        System.out.println("states after= " + states);


    }
}
