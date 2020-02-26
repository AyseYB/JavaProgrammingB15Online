package day17;

public class WakeUp_FullNameCorrector2 {

    public static void main(String[] args) {

        String fullName = "EmIn bIlgiC";
        int indexOfSpace =fullName.indexOf(" ");
        String firstName=fullName.substring(0,indexOfSpace);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();


        String lastName=fullName.substring(indexOfSpace+1);
        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullNameCorrected = firstName +" " + lastName;



        System.out.println(fullNameCorrected);



    }
}
