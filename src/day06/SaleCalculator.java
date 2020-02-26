package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        /*Wake Up Task

        Create a program ti calculate the final discounted price of an item.

                Create three variable called regularPrice , sale price and discount

        ask question using scanner for regularPrice and discountPercentage
        and save the result into the variable

        Calculate sale price using above information
        Fpr example : 80 regular price , 0.2 for discount , sale price  --->> 64
        print out : regular price is 80 , discount 0.2 and your got deal for $64
*/

        Scanner scan= new Scanner(System.in);

        double regularPrice = 80;
        double salePrice = 64;
        double discount = 0.2;

        System.out.println("  What is the regular price?");
        regularPrice = scan.nextDouble();

        System.out.println("  What is the discount rate?");
        discount = scan.nextFloat();

        salePrice =  regularPrice * discount;

        System.out.println("  regular price is $ 80 , discount is 0.2 and your got deal for  $ 64");
    }
}
