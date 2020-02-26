package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_109 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below
        for (int i = 0; i < arr.length; i++) {

            //String first3letters = arr[i].substring(0,4);
            System.out.println(arr[i].substring(0,3));
        }

    }

//    The code provided in your main method will take in five Strings and save them into an array called arr.
//    Print out the first three letters of each element of arr, one per line.
//    You can assume that every element of arr is at least 3 letters long.
//
//    Example:
//    arr -> ["apple", "banana"]
//    prints: app
//            ban
//    Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?
}
