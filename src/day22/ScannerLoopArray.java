package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
//
//        int [] numbers = new int[10];
//
//        for( int x = 0 ; x < numbers.length ; x++){
//            System.out.println("Enter your number " + (x+1) );
//
//            numbers[x]=scan.nextInt();
//            //System.out.println(numbers[x]);
//        }
//
//        for( int x = 0; x < numbers.length ; x++){
//            System.out.print(  numbers[x]+ " "  );
//        }

        int [] numbers =new int[3];
        //creating int array with capacity
        // and assigning it to numbers variable

        for (int x =0 ; x< numbers.length;x++ ){
            System.out.println("enter your number " + (x+1));
//    filling up the array value with scanner
            numbers [x]=scan.nextInt();
        }
        // printing out what's inside the array
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println(numbers[x] + " ");
        }











    }
}
