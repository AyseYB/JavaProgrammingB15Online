package office_hour;

import java.util.Scanner;

public class Week_ReplIt {
    public static void main(String[] args) {
//        Create an object of Scanner class named scanner.
//        Create int variable named day.
//        Write an if statement that will print day of the week based on value of the day variable.

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the day");
        int day = scanner.nextInt();
        if(day==1){
            System.out.println("it is Monday");
        }else if(day==2){
            System.out.println("it is Tuesday");
        }else if(day==3){
            System.out.println("it is Wednesday");
        }else if(day==4){
            System.out.println("it is Thursday");
        }else if(day==5){
            System.out.println("it is Friday");
        }else if(day==6){
            System.out.println("it is Saturday");
        }else if(day==7){
            System.out.println("it is Sunday");
        }else{
            System.out.println("There is no such a day!!");
        }



    }
}
