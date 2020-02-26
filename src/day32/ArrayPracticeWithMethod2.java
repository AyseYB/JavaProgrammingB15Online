package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod2 {

    public static void main(String[] args) {
        printArrayItems(new int[]{1,2,3,4,5,6});
        int[] scores={49,33, 45, 32, 22, 10} ;
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);


    }

    // printArrayItems
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items : --->>> all the items here
    public static void printArrayItems(int[] nums){
        System.out.println(Arrays.toString(nums));
    }


    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums){
        int max=nums[0];
        for (int i = 0; i < nums.length ; i++){
            if(nums[i] > max){
                max=nums[i];
            }

        }
        System.out.println(max);
    }

    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array
    public static void printMinOfIntArray(int[] nums){
        int min=nums[0];
        for (int i = 0; i < nums.length ; i++){
            if(nums[i]< min){
                min=nums[i];
            }
        }
        System.out.println(min);
    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers

    public static void printSumOfIntArray(int[] nums){
        int sum = 0;
//        for (int i = 0; i < nums.length ; i++){
//            sum +=nums[i];
//        }
//        System.out.println(sum);
        for (int each : nums) {
            sum += each;
        }
        System.out.println(sum);

        }

    }

