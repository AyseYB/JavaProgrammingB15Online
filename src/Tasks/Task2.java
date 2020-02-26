package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        given 3 whole numbers variable  num1, num2 , num3 with value already set .
//        and another int variable called sumOfSpecialNumber with initial value 0
//        Write a program to print
//        Only the sum of numbers that more than 20
//        for example  10, 25, 30 . --->> 25+30=55

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sumOfSpecialNumbers = 0;
        if (num1 >= 20) {
            sumOfSpecialNumbers += num1;
        }
        if (num2 >= 20) {
            sumOfSpecialNumbers += num2;
        }
        if (num3 >= 20) {
            sumOfSpecialNumbers += num3;
            System.out.println(sumOfSpecialNumbers);
        }


    }
}