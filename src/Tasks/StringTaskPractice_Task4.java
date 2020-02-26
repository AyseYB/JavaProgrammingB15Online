package Tasks;

import java.util.Scanner;

public class StringTaskPractice_Task4 {
    public static void main(String[] args) {
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  :
//        middle character: g
//        (if the length is even number get the one on the left)

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a word: (Length at least 3 letters)");
//        String word = scan.next();
//        System.out.println("First letter: " + word.charAt(0));
//        System.out.println("Last letter: " + word.charAt(word.length()-1));
//        System.out.println("Middle letter: " + word.charAt((word.length() - 1)  / 2));
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next();
        System.out.println("First letter is " + word.charAt(0));
        System.out.println("last letter is " + word.charAt(word.length() -1));
        System.out.println("Middle letter is " + word.charAt((word.length() - 1 ) /2));

    }
}