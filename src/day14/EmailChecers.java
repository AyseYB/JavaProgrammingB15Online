package day14;

public class EmailChecers {

    public static void main(String[] args) {

        //create a variable called email
        //check for below conditions

        //if it does not contain character @ say invalid email


        //if it contains space say invalid email



        //if it endsWith @gmail.com--->> print gmail

        //if it endsWith @yahoo.com --->> print yahoo email
        //if it endsWith @mail.ru -->>russian email
        String email = "abc@ .com";

        if( !email.contains("@") || email.contains(" ")) {
            System.out.println("invalid email");
        }else if( email.endsWith("@gmail.com")){
            System.out.println("google email");
        }else if ( email.endsWith("@yahoo.com")){
            System.out.println(" yahoo email");
        }else if( email.endsWith("mail.ru")){
            System.out.println(" Russian mail");
        }





    }
}
