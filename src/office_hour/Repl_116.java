package office_hour;

import java.util.Scanner;

public class Repl_116 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
//        nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
//nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
//nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0

        int countOfEven =0 ;
        for(int i= 0 ; i< nums.length ; i++){
            if(nums[i] %2 == 0){
                ++countOfEven;
            }
        }
        System.out.println(countOfEven);














    }

}
