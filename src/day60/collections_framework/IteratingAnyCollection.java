package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {


        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()){
           // System.out.println("myIter.next() = " + myIter.next());
            if(myIter.next() <= 10){
                myIter.remove();
            }
        }

        // hasNext() -->> check whether you have next item
//        System.out.println("myIter = " + myIter.hasNext());
//        //next() --> will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//
//        // removing whatever is the iterator is pointing to at this location
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next());
//
//        System.out.println("myIter = " + myIter.hasNext());

        System.out.println("nums = " + nums);

    }
}
