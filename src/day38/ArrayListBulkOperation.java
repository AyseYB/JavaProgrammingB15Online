package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {

        List<String >groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String > newList= new ArrayList<>(groceries);
        newList.add("Diet coke");
        newList.add("Sugar");
        System.out.println("newList = " + newList);

        // actually I have list of items for you here : Pasta, branzini, asparagus,
        // spinach
        // good news is I already created a List object for you so
        // you can just add them all to your existing list
        List<String> newItemsToAdd =Arrays.asList("Pasta", "branzini",
                "asparagus", "spinach");


        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newLst
        // add all will take any type of List
        newList.addAll(newItemsToAdd);
        System.out.println("newList with all items = " +"\n" +newList);

        ArrayList<Integer> num1  = new ArrayList<>();
        num1.add(123);
        num1.add(456);
        ArrayList<Integer> nums2= new ArrayList<>();
        nums2.add(678);
        nums2.add(900);

        //add all nums2 items into num1
        num1.addAll(nums2);
        System.out.println("num1 = " + num1);
        System.out.println("nums2 = " + nums2);


        // Arrays.asList method will return a List Object that contains items it specified
        //add 4 items to nums2 using add all 100, 200, 300, 400
        nums2.addAll(Arrays.asList(100, 200, 300, 400));

        System.out.println("nums2 after adding 4 items = " + nums2);
        
        
    }

}
