package office_hour;

import java.util.Scanner;

public class Repl_98 {
    public static void main(String[] args) {

//        Print out the number of times that the string "hi" appears anywhere in the given string.
//Example:
//input: abc hi how hi
//output: 2
//
//Example:
//input: hi code java please
//output: 1
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countOfHi=0;


//        for( int i = 0 ; i <= str.length()-2 ; i++) {
//            String currentTwoChar =str.substring(i , i +2);
//            if (currentTwoChar.equals("hi")) {
//                ++countOfHi;
//            }
//        }
//        System.out.println(countOfHi);

        int count = 0;
        for(int i = 0; i <= str.length()-4 ;  i++){
            String currentFourChar = str.substring(i, i+4);
            if(currentFourChar.equals("ayse")){
                ++count;
            }

        }
        System.out.println(count);

























    }
}
