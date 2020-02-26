package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {
//
//        long[] myLong ={6L, 11L, 30L, 45L, 34L};
//        System.out.println("before swap = " +  Arrays.toString(myLong));
//        swapFirstAndLastValue(myLong);
//        System.out.println("After swap = " + Arrays.toString(myLong));

//        long[] myNums =new long[5];
//        System.out.println(Arrays.toString(myNums));
//        Long[] muNums1 =new Long[5];
//        System.out.println(Arrays.toString(muNums1));

        int[] newArray = {1, 2, 3, 4, 5};
        System.out.println("before swapping = " + Arrays.toString(newArray) );

        swapFirstAndLastValue(newArray);
        System.out.println("after swapping = " + Arrays.toString(newArray));


        int x = 0;
        Integer x1 = null;
        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        // WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES )
        // CAN ASSIGNED TO NULL VALUE
        // TO DEFINE , IT'S NOT POINTING TO ANY OBJECT YET


    }

    /**
     * swap first and last Value of long array
     * @param nums
     */

      public static void swapFirstAndLastValue(int[] nums){

       int temp = nums[0];
       nums[0] =nums[nums.length-1];
       nums[nums.length-1]= temp;
      }
//    public static void swapFirstAndLastValue(long[] nums){
//        //first value,  last value
//        //nums[0] , nums[nums.length-1]
//
//        long temp = nums[0];
//        nums[0] =nums[nums.length-1];
//        nums[nums.length-1]=temp;
//
//    }
}
