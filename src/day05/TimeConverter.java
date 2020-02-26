package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner time =new Scanner(System.in);

        System.out.println( " how many hours you are working in a week?");
        int workHours = time.nextInt();
        int minute = workHours * 60 ;
        System.out.println(" YOu are working " + minute + " minutes in the week.");




    }
}
