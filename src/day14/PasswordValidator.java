package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        //PASSWORD VALIDATOR
        //MINIMUM 8 CHAR MAX 16 CHAR
        //IT MUST NOT CONTAINS SPACE
        //IT MUST START Ab
        //if any of above condition does not match say INVALID PASSWORD
        //else say GOOD PASSWORD
        String password = "JDIDJJI3443kdjid";
        //MINIMUM 8 char max16 char
        boolean min8max16 =password.length()>=8 && password.length()<=16;

        //IT MUST CONTAINS _ OR $
        boolean mustContain_or$ =password.contains("_") || password.contains("$");

        //IT MUST NOT CONTAINS SPACE
        boolean mustNotContainsSpace = !password.contains(" ");

        //IT MUST START WITH Ab
        boolean mustStartWithAb=password.startsWith("Ab");

        if(min8max16 && mustContain_or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }









    }

}
