package office_hour;

import java.util.Scanner;

public class Repl_96_Seperator {

    public static void main(String[] args) {

//        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
//Example:
//input: Word
//input: X
//input: 3
//output: WordXWordXWord
//
//Example:
//input: This
//input: And
//input: 2
//output: ThisAndThis
//
//Example:
//input: This
//input: And
//input: 1
//output: This
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

//        for(int i =1 ; i < count ; i++) {
//            System.out.print(word+separator);
//        }
//        System.out.println(word);
        String big=word;
        for (int i = 1; i <count; i++) {

            big+=separator+word;
        }
        System.out.println(big);








    }
}
