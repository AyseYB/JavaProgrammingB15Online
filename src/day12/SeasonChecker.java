package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        //create a string variable called season
        // assign value by asking user question : enter your season please!!
        //check the season using if statements without caring about the case
        //if spring-->> Hiking, Navruz, allergy season, cool weather,
        //if summer -->> pool, swimming, beach, vacation
        //if fall --> bbq, riding bike, just code
        //if Winter -->> code!! , ski, sledding, snowman
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your season please");
        String season= scan.next();

        if(season.equalsIgnoreCase("spring")  ){
            System.out.println("Hiking, Navruz, allergy season, cool weather");
        }else if(season.equalsIgnoreCase("Summer")){
            System.out.println("pool, swimming, beach, vacation");
        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("bbq, riding bike, just code");
        }else if(season.equalsIgnoreCase("Winter")){
            System.out.println(" code!! , ski, sledding, snowman");
        }else{
            System.out.println(" not valid");
        }
    }
}
