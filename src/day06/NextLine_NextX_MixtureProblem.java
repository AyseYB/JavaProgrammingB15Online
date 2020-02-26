package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);

        System.out.println(" What is your name ?");
        String name= scan.nextLine();
        System.out.println( " your name is " + name);

         */
        ;

            Scanner blabla = new Scanner(System.in);

            System.out.println(" What is your name ?");

            String name = blabla.nextLine();
            System.out.println( " Your name is " + name);



            System.out.println(" What is your age? ");
            int age = blabla.nextInt();
            // notice we are not storing this info variable
            //we just want below line to capture ENTER keyboard in
            // so that it does not accidentiallly get captured by
            //the nextLine we use to capture
            blabla.nextLine();
            System.out.println(" You age is " + age) ;

            System.out.println(" What is the address ?");
            String address = blabla.nextLine();
            System.out.println("Your address is " + address);














        }



}
