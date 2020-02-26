package Tasks;

import java.util.Scanner;

public class StringTaskPractice_Task6 {

    public static void main(String[] args) {
//        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name with 2 words");
//        String fullName = scanner.nextLine();
//        //first char is charAt(0)
//        //getting second word -->> substing ( start with the location after space)
//        int spaceIndex = fullName.indexOf(" ");
//      //  System.out.println("spaceIndex = " + spaceIndex);
//        String email = fullName.charAt(0) + fullName.substring(spaceIndex + 1);
//        System.out.println(email + "@NightWatch.com" );


       String fullName =scanner.nextLine();
       int spaceOfIndex = fullName.indexOf(" ");
       String email = fullName.charAt(0) + fullName.substring(spaceOfIndex + 1);
        System.out.println(email + "@NightWatch.com");






    }
}
