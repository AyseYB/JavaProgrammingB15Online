package day06;

import java.util.Scanner;

public class CoinConverter {

    public static void main(String[] args) {

        int cent = 200;
        int quarter =25;
        int dime = 10;
        int nickel = 5;

        //Scanner converter = new Scanner(System.in);

        int centQ = cent / quarter;
        int centD = cent / dime;
        int centN = cent / nickel;

        System.out.println( " 200 cents have  " + centQ + " quarter, " + centD + " dime, " + centN +" nickel.");

        cent -= 74;

        int quarterL = cent / 25;
        int penny= cent %25;
        System.out.println( quarterL);
        System.out.println( penny);

        int dime2 = cent / 10;
        System.out.println( dime2);
        int penny2 = cent % 10;
        System.out.println( penny2);













    }




}
