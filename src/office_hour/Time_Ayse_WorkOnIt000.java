package office_hour;

import java.util.Scanner;

public class Time_Ayse_WorkOnIt000 {

    public static void main(String[] args) {

//        In this assignment, you will write code to put together time of day.
//
//                Like this: 12:24:33 PM
//1. Declare variables: hour, minute, second that can hold int values.
//        Declare amOrPm variable that can hold a String ("AM" or "PM")
//
//        2. Instructor will set different values to your variables
//
//        3. Using the variables and concatenation, print values in the format mentioned above.
 //       Scanner sc = new Scanner(System.in);
   //  hour   = sc.nextInt();
//        minute = sc.nextInt();
//        second = sc.nextInt();
//        amOrPm = sc.next();
//        //#############################
        Scanner scan=new Scanner(System.in);
        //System.out.println("time");

        int hour, minute, second;
        hour=scan.nextInt();
        minute=scan.nextInt();
        second=scan.nextInt();
        String amOrPm =scan.next();
        System.out.println(hour+":"+minute+":"+second+amOrPm);





    }
}
