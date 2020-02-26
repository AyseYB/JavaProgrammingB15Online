package office_hour;

import java.util.Arrays;

public class FindingMissingNumberInTheArray {

    public static void main(String[] args) {

        int result = missingNumber(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10});
        int result1 =missingNumber(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}) ;
        int result2 =missingNumber(new int[]{10, 5, 1, 2, 4, 6, 8, 3, 9});
        System.out.println("the missing number = " +  result);
        System.out.println("the missing number = " + result1);
        System.out.println("the missing number = " + result2);

    }

    public static int missingNumber(int [] a)
    {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length ; i++){
            sum = sum+numbers[i];
        }
        //System.out.println(sum);

        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 = sum1+a[i];
        }
        //System.out.println(sum1);
        return sum - sum1;

    }
}
