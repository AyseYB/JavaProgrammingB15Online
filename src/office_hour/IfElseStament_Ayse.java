package office_hour;

import java.util.Scanner;

public class IfElseStament_Ayse {

    public static void main(String[] args) {

        boolean WeatherIsNice= false;
        if(WeatherIsNice){
            System.out.println("Lets go  swimming");
        }else{
            System.out.println("Stay home\nWatch movie");
        }

        //I love Mustafa.

        //Hello.

        //Hi there.

//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter username and password:");
//
//        String userName = input.next();
//        String password = input.next();
//
//        String validUserName = "superuser";
//        String validPwd = "abc123";
//
//        if(userName.equals(validUserName) && password.equals(validPwd)){
//            System.out.println( " Access granted. Welcome Agent");
//        }else{
//            System.out.println("Access denied");
//        }
         Scanner scan= new Scanner(System.in);
//        System.out.println( " Enter your firs and second name");
//
//        String firstName = scan.next();
//        String lastName = scan.next();
//
//        String validFirstName= " Zeynep";
//        String validLastName = "Bilgic";
//
//        if(firstName.equals(validFirstName)&&lastName.equals(validLastName)){
//            System.out.println(" Hello Zeynep");
//        }else{
//            System.out.println("Who are you?");
//        }
//
        System.out.println(" Enter your current Speed : ");
        int currentSpeed= scan.nextInt();

        if(currentSpeed>60){
            System.out.println("Slow Down");
           // currentSpeed -=5;
        }else {
            System.out.println(" Keep Driving");
        }
       // System.out.println(currentSpeed);

    }
}
