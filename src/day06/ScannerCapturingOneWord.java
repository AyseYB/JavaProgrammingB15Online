package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {




            Scanner scan = new Scanner(System.in);
            System.out.println( "what is your name?");
            String name = scan.next();// it will only capture first word ( seperated by word)
            //String anotherWord = scan.next();

            System.out.println(" you have entered " + name);
            int age = scan.nextInt();
            // System.out.println( " another word is " + anotherWord);
            System.out.println(" you have entered " + age);

        }
}
