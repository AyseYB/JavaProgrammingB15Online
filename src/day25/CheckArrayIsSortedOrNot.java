package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13, 31, 8, 5, 21, 2};
        //Storing the size of an array into a variable
        System.out.println(Arrays.toString(nums));
        int itemCount = nums.length;

        // creating an array with same size as original array
        int[] numsCopy =new int[itemCount];
        numsCopy[0] =nums [0];
        numsCopy[1] =nums [1];
        numsCopy[2] =nums [2];
        numsCopy[3] =nums [3];
        numsCopy[4] =nums [4];
        numsCopy[5] =nums [5];

        for (int i = 0; i < itemCount ; i++) {
            numsCopy[i]=nums[i];

        }

            System.out.println("Before sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort nums COpy " + Arrays.toString(numsCopy));

        // Check whether the array still have same content in same order after sorting
        // what method will check for content

        if(Arrays.equals(nums,numsCopy)){
            System.out.println("This array is already sorted");
        }else{
            System.out.println("This array is not sorted");
        }



        // plain english logic to see a set of 7 number is sorted or not
        // you copy this 7 number in another container
        // sort the the number and check whether it still has same order as original number
        // why did we copy ? because if we directly sort original 7 item , we will lose order
        // and there be nothing to compare with
















    }
}
