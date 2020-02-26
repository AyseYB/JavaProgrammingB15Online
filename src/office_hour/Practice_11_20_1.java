package office_hour;

import java.util.Scanner;

public class Practice_11_20_1 {
    public static void main(String[] args) {

        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        // tomatoes
        item1 = scan.next();
        count1= scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        //cheese
        item2 = scan.next();
        count2= scan.nextInt();
        price2= scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        //apples
        item3 = scan.next();
        count3= scan.nextInt();
        price3= scan.nextDouble();

        double totalPrice1= price1*count1;
        double totalPrice2= price2*count2;
        double totalPrice3= price2*count3;
        if(count1>0){
        }

        totalPrice=price1*count1 + price2*count2 + price3*count3;




    }
}
