package day06;

import java.util.Scanner;

public class SaleCalculator2 {

    public static void main(String[] args) {

        //double regularPrice = ;
        //double salePrice = 25;
        //double discountRate = 0.5;

       // double  regularPrice, salePrice, discountRate;


        Scanner scan = new Scanner(System.in);

        double  regularPrice, salePrice, discountRate;


        System.out.println( " what is the regular price ?");
        regularPrice = scan.nextDouble();

        System.out.println( " what is the discount rate");
        discountRate= scan.nextDouble();

        salePrice = regularPrice*discountRate;

        System.out.println( " you got " + discountRate + " off , and you need to pay " + salePrice + " from the regular price" + regularPrice );










    }














}
