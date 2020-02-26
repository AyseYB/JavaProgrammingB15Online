package office_hour;

import java.util.Scanner;

public class PatientInfo {

    public static void main(String[] args) {

        System.out.println("Welcome to the patient portal");
        System.out.println(" please enter your personal information");
        System.out.println(" please enter your first name");
        Scanner scan= new Scanner(System.in);
        String firstName= scan.nextLine();
        System.out.println(" please enter your last name");
        String lastName= scan.nextLine();
        System.out.println(" Please enter your full name");
        String fullName= scan.nextLine();
        System.out.println(" Please enter your email address");
        String email= scan.nextLine();
        System.out.println("Please enter your your street");
        String street = scan.nextLine();
        System.out.println(" please enter your state");
        String state= scan.nextLine();
        System.out.println(" please enter your city");
        String city= scan.nextLine();
        System.out.println(" please enter your address");
        String address= scan.nextLine();
        System.out.println(" please enter your emergency contacts");
        String contacts= scan.nextLine();
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("Please enter your zipcode");
        int zipcode= scan.nextInt();
        System.out.println(" please enter your height");
        double height= scan.nextDouble();
        System.out.println(" please enter your weight"
        );
        double weight= scan.nextDouble();
        System.out.println("please enter your marital status");
        boolean isMarried=scan.nextBoolean();
        System.out.println(" please enter your work phone number");
        long workPhoneNumber=scan.nextLong();

        System.out.println(" Patient personal info");
        System.out.println(fullName+":"+lastName+",");
        System.out.println(address+":");



    }
}
