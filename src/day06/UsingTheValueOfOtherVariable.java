package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariable {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println( " My favorite number " + myFavoriteNumber);
        System.out.println( " your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber =100;
        System.out.println( " my favorite number " + myFavoriteNumber);
        System.out.println( " your favorite number " + yourFavoriteNumber);

        // create a varable called yourOrder , type String and assign the value
        // create another variable called myOrder  and assign the value
        // to same value as yourOrder by copying
        // and just print them our
        Scanner input = new Scanner(System.in);
        System.out.println( " what is your order ? i want the same");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder;

      //  String yourOrder = " gucci bag";
        //String myOrder = yourOrder;
        System.out.println(" your order is  " + yourOrder + " \n" + " my order is " + myOrder);







    }






}
