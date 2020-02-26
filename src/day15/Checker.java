package day15;

import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {

          //String name = "ayse";
//        if(name.length()<=4){
//            System.out.println("Short name");
//        }else if(name.length()>=5 && name.length()<=10){
//            System.out.println("medium name");
//        }else if(name.length()>11){
//            System.out.println("longer name");
//        }
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scan.next();
        int lengthOfTheName=name.length();
        System.out.println("length of the name =" + lengthOfTheName);
        if(lengthOfTheName<4){
            System.out.println("short name");
        }else if(lengthOfTheName>=4 && lengthOfTheName<=11){
            System.out.println("Medium Name");
        }else{
            System.out.println("Longer name");
        }
        if (name.contains("a")  || name.contains("e")){
            System.out.println(" name contains a or e");
        }else {
            System.out.println(" i dont have a or e in my name");
        }


    }
}
