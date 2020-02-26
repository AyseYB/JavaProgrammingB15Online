package day05;

import java.util.Scanner;

public class ScannerHomework {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* System.out.println(" What is your hourly wage? ");
        float hourlyWage = scan.nextFloat();
        System.out.println(" How many hours do you work in week?" );
        int workHour= scan.nextInt();
        float weeklyWage = workHour * hourlyWage;
        float yearlyWage = weeklyWage * 50;
        System.out.println(" YOu earn " + weeklyWage + " in a week, and " + yearlyWage + "in a year .");

*/
        System.out.println(" what is the price of the tomato?");
        float tomatoPrice = scan.nextFloat();
        System.out.println(" How many tomato do you need?");
        int tomatoCount = scan.nextInt();

        System.out.println(" what is the price of potato?");
        float potatoPrice = scan.nextFloat();
        System.out.println(" How many potato do you need?");
        int potatoCount =  scan.nextInt();

        System.out.println(" what is the price of banana?" );
        float bananaPrice = scan.nextFloat();
        System.out.println(" How many banana do you need?");
        int bananaCount = scan.nextInt();

        System.out.println( " your total price is  $" + ( tomatoCount * tomatoPrice ) +  (potatoCount *potatoPrice )+ ( bananaCount * bananaPrice));



    }
}
