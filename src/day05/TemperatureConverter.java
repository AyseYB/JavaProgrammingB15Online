package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(" what is the temperature in F?");
        double fahrenheit =scan.nextDouble();
        double celsius = ( 5.0 /9) * ( fahrenheit -32);
        System.out.println(fahrenheit + " F" + " is " + celsius + " in celsius" + ". ");

        System.out.println( " what is the tempreture today in F ?");
        double fahrenheit2 = scan.nextDouble();
        double celsius2 = (5.0 / 9) * ( fahrenheit2 -32);

        System.out.println( fahrenheit2 + " F  is " + celsius2 + " C ." );







        }
    }




