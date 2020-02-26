package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int[] scores1 ={2, 5, 6, 7, 3, 34, 6};
        int[] scores2 ={22, 45, 6, 37, 3, 6, 9};
        int[] scores3 ={2, 5, 6, 7, 3, 34, 6};
        int[] score4 ={5, 6 , 7, 34, 3, 6, 2};
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)


        boolean isS1S3Equals= Arrays.equals(scores1,scores3);
        System.out.println("is score1 has same content as score3 " + isS1S3Equals);

        boolean isS1S2Equals =Arrays.equals(scores1,scores2);
        System.out.println("is score1 has same content as score2 " + isS1S2Equals);


// boolean isS4S1Equals =Arrays.equals(score4, scores1);
 Arrays.sort(score4);
 Arrays.sort(scores1);
        System.out.println(Arrays.toString(score4));
        System.out.println(Arrays.toString(scores1));

        boolean isS4S1Equals =Arrays.equals(score4, scores1);
        System.out.println(isS4S1Equals);





















    }
}
