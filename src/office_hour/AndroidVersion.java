package office_hour;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {

//        Create an object of Scanner class named scanner.
//        Create double variable named version.
//        Write an if statement that will print android version name based on value of the version variable.
//
//        For example:
//        if version = 1.5, then print "Cupcake"
//        or, if version = 3.1, then print "Honeycomb"
//        or, if version is grater or equals to 4.1 and less or equals to 4.3.1 then print "Jelly Bean"
//
//        hint:  if(version>=4.1 && version<=4.31)
//
//            Otherwise (else), print "Sorry, I don't know this version!";
//        input: 1.5
//        output: Cupcake
//
//        input: 9.0
//        output: Pie
//
//        input: 11.0
      System.out.println(" Please push the button to get your order :");
        Scanner scanner=new Scanner(System.in);
        double version=scanner.nextDouble();
        if(version==1.5){
            System.out.println("Cupcake");
        }else if(version==3.1){
            System.out.println("Honeycomb");
        }else if(version>=4.1 && version<= 4.31){
            System.out.println("Jelly Bean");
        }else{
            System.out.println("Sorry, I don't know this version!");
        }











    }
}
