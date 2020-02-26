package day05;

import java.util.Scanner;

public class GroceryActions3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println(" what is the price of banana?" );
        float bananaPrice = scan.nextFloat();
        System.out.println("How many you want to buy?");
        int bananaCount = scan.nextInt();
        float bananaTotal = bananaCount * bananaPrice;
        System.out.println(" Your total for banana is " + bananaTotal);







    }
}
