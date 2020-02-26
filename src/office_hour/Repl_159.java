package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_159 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers2(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for (int i = 0; i <nums.length ; i++) {

            boolean wasEqual = false;

            for (int j = 0; j < i ; j++) {

                if (nums[i] == nums[j]) {
                    wasEqual = true;
                    break;
                }
            }

            if (!wasEqual)
            {
                System.out.println(nums[i]);
            }
        }
    }

    public static void printUniqueNumbers2(int[] nums){
        //WRITE YOUR CODE HERE

        Arrays.sort(nums);

        int curr = nums[0];

        System.out.println(curr);

        for (int i = 1; i <nums.length ; i++) {
            if (nums[i] != curr){
                System.out.println(nums[i]);
                curr = nums[i];
            }
        }
    }
}
//Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
//
//Example:
//input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
//output:
//2
//9
//34
