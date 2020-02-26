package office_hour;

import java.util.Scanner;

public class Practice_12_04 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("a word");
        String first = scanner.next();
        char firstCharacterofTheFWord = first.charAt(0);

        System.out.println("another word");
        String second = scanner.next();
        char firstCharacterOfTheSWord = second.charAt(0);

        for( char iChar =firstCharacterofTheFWord; iChar <=  firstCharacterOfTheSWord ; iChar++ ){
            System.out.print( iChar + " ");
        }



//        System.out.println("Enter 1 st word with a single character to start with");
//        String first = scanner.next();
//        char firstAsChar = first.charAt(0);
//
//        System.out.println("Enter 2 st word with a single character to end with ");
//        String second =scanner.next();
//        char secondAsChar = second.charAt(0);
//
//        for (char iChar =firstAsChar  ; iChar <= secondAsChar ; iChar++){
//            System.out.print(iChar + " ");
//        }


        //user enter A for the first part
        //user enter C for the second part
        //expected result is A B C

        //user enter D for the first part
        // user enter A for the second part
        //expected result is D C B A





















    }
}
