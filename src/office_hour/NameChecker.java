package office_hour;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name:");
        String name= scan.next();
        int lengthOfName= name.length();
        if(lengthOfName<4){
            System.out.println("Short name");
        }else if (lengthOfName<=11){
            System.out.println("medium name");
        }else{
            System.out.println("longer name");
        }



    }
}
