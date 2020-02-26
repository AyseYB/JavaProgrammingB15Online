package office_hour.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {


//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

       // List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));
        List<String > stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        
      //  Iterator<Integer> numIter = lst.iterator();
        // 3 methods available : hasNext() , next() , remove
        Iterator<String > stringIterator = stringList.iterator();

        //System.out.println("numIter.hasNext() = " + numIter.hasNext());
        System.out.println("\"stringIterator.hasNext() = \" + " + stringIterator.hasNext() );

        //  System.out.println("numIter.next() will move the pointer to the next element and get the value \n" +
        //        numIter.next());



    }
}
