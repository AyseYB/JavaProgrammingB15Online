package day04;

import java.util.Scanner;

public class StudyByMyself2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first name please : ");

        String firstName = scan.next();
        System.out.println(" You have entered : " + firstName);

        System.out.println(" what is your age? :");
        int age = scan.nextInt();
        System.out.println("Your age is :" +age);


        String firstN = "Ayse ";
        String lastN = "YB";
        String fullN = firstN + lastN;

        System.out.println("My first name is " + firstN );
        System.out.println("My last name is " + lastN);
        System.out.println( "My full name is " + fullN);


        String firstName3 = "Alan";
        String lastName = " Turing";


        System.out.println( lastName + ", " + firstName3);



    }

}
