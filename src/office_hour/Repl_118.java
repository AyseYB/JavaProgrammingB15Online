package office_hour;

import java.util.Scanner;

public class Repl_118 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below
//        Example:
//        arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
//        prints:  apple , banana , kiwi
//        banana , kiwi , grape
//        kiwi , grape , milk
//        grape , milk , soda

        for (int i = 0 ; i < arr.length -2 ; i++){
            System.out.println(arr[i] + " , " + arr[i+1] + " , " + arr[i+2]);
        }




    }











}
