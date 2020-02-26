package office_hour;

import java.util.Scanner;

public class MultiBranchStatementAyse {

    public static void main(String[] args) {

        char grade = 'B';

        if(grade == 'A'){
            System.out.println("Excellent");
        }else if( grade== 'B'){
                System.out.println("Good");
            }else if(grade=='C'){
            System.out.println("not Bad");
        }else{
            System.out.println("Could be better ");
        }
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter your shoe size");
//        int size = scan.nextInt();
//        if(size>12){
//            System.out.println("Sorry, your shoe size is not in stock");
//        }else if (size>=6){
//            System.out.println(" YOur shoe is in stock !");
//        }else {
//            System.out.println(" Sorry, this store does not carry shoes smaller than size 6");
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Enter your shoe size :");
//        int shoeSize = scan.nextInt();
//        if (shoeSize>12) {
//            System.out.println("Sorry, we dont have your shoe size");
//        }else if(shoeSize>=5){
//            System.out.println("We have your shoe size !!");
//        }else{
//            System.out.println(" Sorry, we dont have kids shoes.");
//        }
//        Scanner scan= new Scanner(System.in);
//        System.out.println(" Enter a number :");
//        int number = scan.nextInt();
//
//        if(number>=0 && number<= 100){
//            System.out.println(" Number is between 0 - 100");
//        }else if(number>100 && number<= 1000){
//            System.out.println("Number is between 101 - 1000");
//        }else if(number>1000 && number<= 1000000){
//            System.out.println("Number is between 1000 - 1000000");
//        }else {
//            System.out.println("Number is either negative or more than 1000000 ");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your child's age :");
        int age= scan.nextInt();
        if(age>0 && age<2){
            System.out.println("Your child is infant");
        }else if(age>2 && age<4){
            System.out.println("Your child is toddler");
        }else if(age>4 && age<6){
            System.out.println("Your child is school age");
        }else if( age>6 && age< 12){
            System.out.println(" Your Child is in elemetary school");
        }else if(age>12 && age<14){
            System.out.println(" Your child is in middle school");
        }else if( age>14 && age<18){
            System.out.println(" Your child is in high school");
        }else {
            System.out.println("Your child is an adult now!");
        }




    }
}
