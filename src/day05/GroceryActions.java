package day05;

import java.util.Scanner;
import java.util.SortedMap;

public class GroceryActions {
    public static void main(String[] args) {
        /* Task %
        * ask user what is the price of tomato and store it
        * ask user how many tomato you want to buy and store it
        * ask user whats the price of potato and store it
        * ask user how man potato you want to buy and store it
        * ask uset what is the price of banana and store it
        * ask uset how many banana you want to but and store it

        *
        */
        Scanner scan =new Scanner(System.in);
        System.out.println(" What is the price of tomato?");
        float tomatoPrice = scan.nextFloat();
        System.out.println(" How many you want to buy?");
        int tomatoCount = scan.nextInt();
        float tomatoTotal = tomatoPrice * tomatoCount;
        System.out.println(" Your total for tomato is " + tomatoTotal);






























    }
}
