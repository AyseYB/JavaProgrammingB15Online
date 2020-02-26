package day62;

import java.util.*;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA","NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));

        System.out.println("states before= " + states);
//        states.remove("GA");
//        System.out.println("states after = " + states);

        states.removeIf(each -> each.contains("A"));
        System.out.println("states after = " + states);

        //remove all the states with letter A
        Iterator<String> stIter = states.iterator();

        while (stIter.hasNext()){
            String  each = stIter.next();
            if (each.contains("A")){
                System.out.println("removing = " + each);
                stIter.remove();
            }
        }
        System.out.println("states after = " + states);
      //  System.out.println("stIter.next() = " + stIter.next());


        //DO NOT CALL NEXT METHOD TWICE IN ONE ITERATOR OR IT WILL SKIP TO NEXT ITEM

//        // The Lambda expression way of removing
//        states.removeIf( each -> each.contains("A")  );
//        System.out.println("states after   = " + states);

    }
}
