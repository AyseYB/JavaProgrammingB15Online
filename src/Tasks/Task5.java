package Tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3 number");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1>20){
            System.out.println("You have entered " +num1+"."+"You will get extra 100 points and your points is " + ((num1)+100));
        }if(num2<20){
            System.out.println("You have entered " +num3+"."+"You will get extra 100 points and your points is " +((num2)+100));
        }if (num3<20){
            System.out.println("You have entered " +num3+"."+"You will get extra 100 points and your points is " +((num3)+100));
        }else {
            System.out.println("Number you have entered more than 100");
        }


    }
}
