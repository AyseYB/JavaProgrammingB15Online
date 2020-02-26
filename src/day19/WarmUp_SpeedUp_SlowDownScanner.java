package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp_SlowDownScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your starting and ending speed");
        int start =scan.nextInt();
        int end = scan.nextInt();

        if(start<end){
            System.out.println("Increaseing the speed");
            for (int i = start ; i < end ; i++);
        }else if(start>end){
            System.out.println("decreasing the speed");
            for (int x = start ; x >= end ; x--){
            System.out.print( x + " ");}
        }else {
            System.out.println("SAME SPEED");
        }













    }
}
