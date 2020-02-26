package office_hour;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        System.out.println("enter your item");
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        double totalBalance, currentBalance;
        totalBalance = 100;

        if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-15;
            System.out.println("your current balance is" + currentBalance);
        }else if(item.equalsIgnoreCase("usb cable")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-10;
        }else if(item.equalsIgnoreCase("headphones")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-30;
        }else if(item.equalsIgnoreCase("pants")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-50;
        }else if(item.equalsIgnoreCase("hat")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-25;
        }else if(item.equalsIgnoreCase("socks")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-5;
        }else if(item.equalsIgnoreCase(" blanket")){
            System.out.println("Thank you for your purchase!");
            currentBalance=totalBalance-60;
        }else if(item.equalsIgnoreCase("40")){
            System.out.println("Thank you for your purchase!");
        }else{
            System.out.println("invalid item");
        }
    }
}