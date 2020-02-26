package office_hour;

import java.util.Scanner;

public class Repl_117 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
//        Example:
//        arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
//        prints:  apple , banana
//        kiwi , grape
//        milk, "soda"
//        juice, coffee

        for (int i = 0 ; i <arr.length-1; i = i+2 ){
            System.out.println(arr[i] + " , " + (arr[i+1]));
        }








    }
}
