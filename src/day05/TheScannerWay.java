package day05;


import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        //ask user for name
        // and capture the result
        // print your name
        // and capture the result
        //print the age
        // ask user for height
        //and capture the result
        //print the height!!

        // creator scanner object
        // you can name your variable whatever youwant
        //i below case we are calling it scan
        // Scanner is data type, scan is the name, new Scanner (System.in) is the value.
        Scanner scan = new Scanner(System.in);


        System.out.println(" What is your name :");
       // String name = "Sam";
       String name = scan.next();

        System.out.println(" What is your birth year? ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println("your  age is :" + age);

        System.out.println( " what is your height?");
        double height= scan.nextDouble();

        System.out.println(" how was your day today /");
        String yourAnswer =scan.next();

        System.out.println(" What did you do with Kavya today?");
        String relationWithKavya = scan.next();





















    }
}
