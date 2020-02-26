package office_hour;

import java.util.Scanner;

public class Repl_115 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

//nums → [2, 1, 2, 3, 4]) → 12
//nums → [2, 2, 0, 3, 5]) → 12
//nums → [1, 3, 5, 7, 9]) → 25
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum =sum + nums[i];
        }
        System.out.println(sum);

















    }
}
