package day17;

public class WakeUp_FullNameCorrector_OneShort1 {
    public static void main(String[] args) {

        String fullName = "emIn bIlgiC";

        String firstName =fullName.substring(0,4);
        String lastName =fullName.substring(5);

        String firstNameCorrected = firstName.substring(0,1).toUpperCase()+ //EMIN -->> E
                                    firstName.substring(1).toLowerCase();// emin --> min
        System.out.println(firstNameCorrected);

        String lastNameCorrected= lastName.substring(0,1).toUpperCase()+ //
                                  lastName.substring(1).toLowerCase();
        System.out.println(lastNameCorrected);

        fullName=firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);

















    }
}
