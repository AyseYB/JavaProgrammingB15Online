package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        // create a ArrayList object of long and assign it to a variable
        ArrayList<Long> lst = new ArrayList<>();

//        C.R.U.D.
//                Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);
//        / I want to insert 125 between 100L and 150L , basically 2nd and 3rd item
        lst.add(2, 125L);
        System.out.println("lst = " + lst);
        System.out.println("lst.get(3) = " + lst.get(3));

        // updating value at certain index : set method
        lst.set(3, 195L);
        System.out.println(" new value of lst.get (3) = " + lst.get (3));

        // removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);
        lst.remove(2);
        System.out.println("lst after removing item at index 2  =  \n\t " + lst);

        // looking for location of certain item

        System.out.println("Location of 125L is " + lst.indexOf(125L));

        // Check whether a list is empty or not
        System.out.println("\n lst.isEmpty() = " + lst.isEmpty());
        System.out.println("\n lst.isEmpty() = " + (lst.size()>0));

        // how do I delete everything inside my ArrayList
       // lst.clear();
       // System.out.println("check after clearing lst.isEmpty() = " + lst.isEmpty());

        // check whether we have certain item or not

        System.out.println("lst.contains(100L) = " + lst.contains(100L));
        System.out.println(" lst.contains(10L) = " +  lst.contains(10L));

        // how do I check whether a list contains an item without using contains method
        // use indexOf method , if it return -1 , it means we don't have it

        System.out.println("Do i have 10L = " + ( lst.indexOf(10L) !=-1));

    }
}
