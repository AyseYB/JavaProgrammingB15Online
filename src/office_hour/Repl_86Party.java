package office_hour;

import java.util.Scanner;

public class Repl_86Party {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
//
//        Guest's list: Nick, Linda

//        String name="";
//        String conf="";
//        String list="";
//        do {
//            System.out.println("Please enter guest name:");
//            name= scan.next();
//            list+=name+", ";
//            System.out.println("Do you want to enter new guest name:");
//            conf = scan.next();
//
//        } while (conf.equalsIgnoreCase("yes")) ;
//
//        System.out.println("Guest's list: "+list);

       String name="";
       String confirmation ="";
       String list ="";



do {
    System.out.println("please enter guest name");
    name = scan.next();
    list += name + " , ";
    System.out.println("Do you want to enter a new guest name :");
    confirmation += scan.next();




}while (confirmation.equalsIgnoreCase("yes"));

        System.out.println("Guest list : " + list);









    }
}
