package day24;

import java.util.Arrays;

public class WorkingByMyselfWIthArrays {

    public static void main(String[] args) {

//        int[] scores ={99, 44, 66, 23, 19, 55};
//        System.out.println(Arrays.toString(scores));
//        System.out.println("Original item value " + scores[0]);

        int[] scores =new int[]{99, 44, 66, 23, 19, 55};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("First item value : "+ scores[0]);
        System.out.println("Last item value : " + scores[scores.length-1]);
        System.out.println("Middle item value : " + scores[(scores.length-1 / 2)]);















    }
}
