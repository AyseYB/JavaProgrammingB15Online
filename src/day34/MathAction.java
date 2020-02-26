package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    //calling
    public static void main(String[] args) {
        //call your build3DigitNumber
        //build3DigitNumber is under day34 package
        //and inside PracticeMethodWithNumbers class
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(4,5,0);
        System.out.println("result1 = " + result1);



        int[] nums = {2, 5, 87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        Calculator_V2.calculate('-',10,20);

    }
}
