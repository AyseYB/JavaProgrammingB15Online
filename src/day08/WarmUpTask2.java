package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        /*
         * Create a program to guess your favorite number
         * create a variable called myFavoriteNumber as int
         * ask user to guess your favorite number
         * if user guessed right  300then print BINGO!
         * if not  300 print try again later
         *
         * */
        Scanner scanner = new Scanner(System.in);

        System.out.println(" GUESS MY FAVORITE NUMBER :");
        int myFavoriteNumber = scanner.nextInt();
        if(myFavoriteNumber == 300 ) {  // BE CAREFULL THERE IS ==  (2) INSTEAD OF = (1)
            System.out.println(" BInGO !!!");
        } else {
            System.out.println( " YOU ARE NOT MY BEST FRIEND , TRY AGAIN ");
        }

        int age = 25;
        if (age>=18 ){
            System.out.println( " go vote !!");
        } else {
            System.out.println( " Wait until 18 !");
        }
    }
}
