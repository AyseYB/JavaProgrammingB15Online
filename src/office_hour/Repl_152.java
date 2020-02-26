package office_hour;

import java.util.Scanner;

public class Repl_152 {
//    Create a method called plus_minus that gets an array of ints (int[]),
//    it outputs how many negative , positive and zero numbers are in the array.
//
//            for example:
//
//  plus_minus (new int[]{1,2,55,-9,-2,0});
//
//    will output:
//    positives:3, negatives:2, zeros:1
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();

        }

        plus_minus(arr);

    }
    //end main
    public static void plus_minus(int[] arr){
        int positiveCount=0;
        int negativeCount=0;
        int zero=0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                ++negativeCount;
            }else if(arr[i]> 0){
                ++positiveCount;
            }else {
                ++zero;
            }
        }
        System.out.println("positives:" + positiveCount +", negatives:" + negativeCount + ", zeros:" + zero);
    }
}
