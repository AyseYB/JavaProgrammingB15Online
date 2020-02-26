package office_hour.Practice12_09;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int num = 9;
        System.out.println(num);
        num = 15;

        int[] nums = new int[4];
        nums[0]=5;
        nums[1]=num;
        nums[2]=25;
        nums[3]= 22;

        System.out.println(Arrays.toString(nums));

        int[] nums1 = new int[3];
        nums1[0]= 1;
        nums1[1]=2;
        nums1[2]=3;
        System.out.println(Arrays.toString(nums1));
        System.out.println(nums1.length);
        System.out.println("nums1.length = " + nums1.length);

        System.out.println("first number of the nums array " + nums1[0]);
        System.out.println("last number of nums1 array = " +( nums1.length - 1));
        System.out.println("Middle value is " + nums1.length/2 );
        System.out.println(nums[nums.length/2]);

        int[] newNums = {1, 3, 5, 7, 8};
        System.out.println("Middle value is " + newNums[newNums.length/2]);

        //how to find the biggest number
       int max = newNums[0];
        for (int i = 0; i < newNums.length; i++) {
            if(newNums[i] > max){
                max = newNums[i];
            }
        }
        System.out.println("Max num is " + max);

      int secondMax = newNums[0];
        for (int i = 0; i < newNums.length; i++) {
            if(secondMax <newNums[i] && newNums[i] != max){
                secondMax = newNums[i];
            }
        }
        // how to find minimum number
        System.out.println(secondMax);

        int minNum = newNums[0];
        for (int i = 0; i < newNums.length; i++) {
            if(minNum > newNums[i]){
                minNum = newNums[i];
            }
        }
        System.out.println(minNum);
//String array================================================================================
        String[] cars = {"BMW", "WV", "Audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        //or we can print all at once using for loop
        for (String eachCar : cars){
            System.out.println(eachCar);
        }
        System.out.println("for loop");
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);

        }

        int[] ages = {23, 5, 6, 7, 8};
        System.out.println(ages[4]);
        System.out.println(ages[3] - ages[2]);

        System.out.println(Arrays.toString(ages));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 languages");
        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();

        String[] languages = {l1, l2, l3};

        System.out.println(languages[0]);

        for ( String  each : languages){
            System.out.println(each);
        }





    }
}
