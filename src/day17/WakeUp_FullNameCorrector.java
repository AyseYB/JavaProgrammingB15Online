package day17;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {

        String fullName = "Ankar Anwar" ;
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace +1);

        String firstNameCorrected
                = firstName.toUpperCase().substring(0, 1) +
                firstName.toLowerCase().toLowerCase().substring(1);
        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0, 1) +
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);

    }
}
