package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        //sortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // the implementing class is treeSet

        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());
    }
}
