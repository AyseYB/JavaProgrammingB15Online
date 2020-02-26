package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        printArrayItems( new int[]{1, 3, 4, 5, 6,3} );
        int[] scores = {2, 5, 32, 4, 5};
        printArrayItems(scores);
       printMaxOfIntArray(scores);
       printMinOfIntArray(scores);
       printSumOfIntArray(scores);
      compare2ArraySize(new String[]{"ayse", "yusuf" } , new String[]{"zeynep" , "emin" ,
        "Mustafa"});
        compare2ArraySize(new String[]{"**", "%%" ,"aa"}, new String[]{"su", "su"});
        String[]fruits={"Apple"};
        String[]fruits2={"watermelon", "pear", "plum"};
        compare2ArraySize(fruits,fruits2);
    }

    //create a method that has one array as a parameter
    //print out each item in this format
    //array has item : --->> all the items here

    public static void printArrayItems ( int[] nums) {

        System.out.println("array has item :" + Arrays.toString(nums));


    }
    //printMaxOfIntArray
    //this method has one int[] as parameter
    //and it will print the max number inside array
    public static void printMaxOfIntArray(int[] numbers){
        int maxNumber=0;
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > maxNumber){
                maxNumber=numbers[i];

            }


        }
        System.out.println("max " + maxNumber);
      //  System.out.println("Max number is " + Arrays.toString());

    }
    public static void printMinOfIntArray(int[] numbers){
        int minNumber= 0;
        for (int i = 0 ; i < numbers.length ;i++) {
            if(numbers[i]<minNumber){
                minNumber=numbers[i];
            }
        }
        System.out.println("min number " + minNumber);
    }
    
    public static void printSumOfIntArray(int[] numbers){
        int sum= 0;
        for (int each : numbers){
            sum +=each; 
        }
        System.out.println("sum = " + sum);
    }

public static void compare2ArraySize(String[] arr1, String[] arr2){
        
        if(arr1.length > arr2.length){
            System.out.println( " arr1 has more item");
        }else if( arr1.length <arr2.length){
            System.out.println(" arr2 has more item");
        }else {
            System.out.println("same size");
        }

}

    /**
     * compare2arraySize
     * create a method that accept 2 String array object
     * and compare the item counts inside these 2 arrays
     * if arr1 is more then print array 1 has more item
     * if arr2 is more then print array 2 has more item
     * else print they have same item count
     */

    public static void compare2arraySize(String[]arr1, String[] arr2){
        if(arr1.length >arr2.length){
            System.out.println("arr1 has more item");
        }else if(arr2.length >arr1.length){
            System.out.println("arr2 has more item");
        }else {
            System.out.println("they have same item count");
        }
    }



}

