package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {
        
//        int finalNumber = 5;
//
//        List<Integer> nums = new ArrayList<>();
//        for (int numbers = 1; numbers <=finalNumber ; numbers++) {
//            nums.add(numbers);
//        }
//        System.out.println("nums = " + nums);

        System.out.println(getListFrom1ToFinalNumber(5));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(15));
        List<Integer> myList = getListFrom1ToFinalNumber(13);
        System.out.println(myList);
    }
    //create a method that accept a finalNumber as int 
    //return an ArrayList of Integer containing numbers
    //starting from 1 till finalNumber
//    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){
//
//        List<Integer> nums = new ArrayList<>();
//        for (int numbers = 1; numbers <=finalNumber ; numbers++) {
//            nums.add(numbers);
//        }
//        return nums;
    //}

    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){

        List<Integer> nums =new ArrayList<>();
        for (int number = 1; number < finalNumber ; number++) {
            nums.add(number);

        }
        return nums;
    }
}
