package office_hour;

import java.util.Scanner;

public class Repl_110 {

    public static void main(String[] args) {

//        Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//
//        Example:
//        words → ["hello", "why", "by", "apple" , "note"]
//        print:
//        ho
//        wy
//        by
//        ae
//        ne
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

//        for(int i = 0 ; i < words.length ; i++){
//            System.out.println( words[i].charAt(0) + "" +words[i].charAt(words[i].length() -1));
//        }
//        for (int i=0; i<words.length; i++) {
//            System.out.println("" + words[i].charAt(0) + words[i].charAt(words[i].length()-1));
//        }
       for(int i = 0 ; i < words.length ; i++){
           System.out.println(words[i].charAt(0) +"" + words[i].charAt(words[i].length()-1));
       }


















    }
}
