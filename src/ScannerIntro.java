import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // I want ti save users input after asking some question.
        // and I want ti save this input so I can do something with it

        // Step 1 : Use Scanner class to create scanner object
        // that have this functionality

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first name please");

        // capture what user typed on keyboard in console for name
        String firstName = scan.next();
        // ask question from before entering.
        // print the result of what we saved from used input
        System.out.println( " you have entered : " + firstName);
        int age = scan.nextInt();
        System.out.println(" what is your age? ");
        //print the result of users age.
        System.out.println( "your age is : " + age);




    }
}
