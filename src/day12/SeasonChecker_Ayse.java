package day12;

import java.util.Scanner;

public class SeasonChecker_Ayse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your season :");

        String season= scan.next();

        if( season.equalsIgnoreCase("spring")){
            System.out.println("hiking, navruz, ");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("Pool, swimming");
        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("bbq, halloween");
        }else if (season.equalsIgnoreCase("winter")){
            System.out.println(" ski, snowman");
        }else{
            System.out.println("not valid");
        }



    }
}
