package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWorld {

    public static void main(String[] args) {

        // Task 4
        // use nextLine to ask your bio
        // what is your name
        //which city you live in
        // what is your street address


        Scanner blabla =new Scanner(System.in);

        System.out.println("what is your name ?");
        String name =blabla.nextLine();
        System.out.println( " you have entered " + name);



       // System.out.println(" what is your name");


        System.out.println(" What is your city and state");
        String city = blabla.nextLine();
        System.out.println( " you have entered city and State " + city);

        System.out.println(" what is your street address?");
        String address = blabla.nextLine();
        System.out.println( " you have entered your address" + address);



    }
}
