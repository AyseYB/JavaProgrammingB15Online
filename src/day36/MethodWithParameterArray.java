package day36;

import office_hour.Practice12_09.Array;

import java.util.Arrays;

public class MethodWithParameterArray {

    public static void main(String[] args) {

       // int[] nums = {1, 3, 4, 6, 7, 2};
//        System.out.println("before sort nums = " + Arrays.toString(nums));
//
//        Arrays.sort(nums);
//        System.out.println("after sort = " + Arrays.toString(nums));
//
//        changeArrayFirstItemTo100(nums);
//        int[] nums={1, 3, 4, 6, 7, 2};
//        System.out.println("before change nums = " + Arrays.toString(nums));
//        changeArrayFirstItemTo100(nums);
//        System.out.println("after change = " + Arrays.toString(nums));
          int[] num = {1, 200, 300, 400, 500};
          changeArrayFirstItemTo100(num);
          System.out.println(Arrays.toString(num));
    }
//    public static void changeArrayFirstItemTo100(int[] numbers){
//        numbers[0] =100;
//
//    }
    public static void changeArrayFirstItemTo100(int[] numbers){
        numbers[0] = 100;
    }
}
