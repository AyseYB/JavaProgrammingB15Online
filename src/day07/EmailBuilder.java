package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println( " Enter your first name , last name, company seperated by space :");


        String firstName, lastName, company, email;
        firstName =  scan.next();//" Astrid";
        lastName =  scan.next();// " Enver";
        company  = scan.next(); // " Verizon";
        //firstName_lastName@company.com Astrid_Enver@Verizon.com
        email = firstName + "_" + lastName + " @"+ company + "com";

        System.out.println( " my name is " + firstName + " " + lastName + " and i work for " + company +
                " and my email address is " + email);





    }





}
