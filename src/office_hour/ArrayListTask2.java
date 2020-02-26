package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask2 {

    public static void main(String[] args) {
//        Integer[] numArr= {1,2,3,4,5};
//        List<Integer>nums=new ArrayList<Integer>(Arrays.asList(numArr));
//
//        reverseTheList(nums);
        Integer[]numArr={1,2,3,4,5};
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(numArr));
reveseList(nums);

    }
//    Write a static void method to accept a List<Integer> and reverse it
//(Do not create new List, use swamp logic)
//public static void reverseTheList(List<Integer>nums){
//
//
//    for (int i = 0; i <nums.size() ; i++) {
//        nums.add(i,nums.get((nums.size()-1)));
//        nums.remove(nums.size()-1);
//
//    }
//    System.out.println(nums);
//}
    public static void reveseList (List<Integer> lst){
        int temp=0;
        for (int i = 0; i < lst.size() /2; i++) {
            temp= lst.get(i);


            lst.set(i, lst.get(lst.size()-1 -i )); //[1, 2, 3, 4]
            lst.set(lst.size()-1-i, temp);


        }

//        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9) ) ;
//        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,12,17,19) ) ;
//        Add numbers2 list to numbers1 list without duplicate items from numbers 2
        
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,12,17,19));
        
        numbers2.removeAll(numbers1);
        System.out.println("numbers2 = " + numbers2);
        numbers1.addAll(numbers2);
        System.out.println("numbers1 = " + numbers1);
        System.out.println("=======================");
//        public static void reversedList( List<Integer> n){
//            int temp=0;
//            for (int i =0; i<n.size()/2 ; i++) {
//                temp=n.get(i);
//                n.set(i,n.get(n.size()-1-i));
//                n.set(n.size()-1-i,temp);
//            }
//        }
    }

    //Write a static void method to accept a List<Integer> and reverse it
    //(Do not create new List, use swamp logic)



}


