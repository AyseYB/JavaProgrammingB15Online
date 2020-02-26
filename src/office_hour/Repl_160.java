package office_hour;

import java.util.Scanner;

public class Repl_160 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            int equalCount = 0;
            for (int k = 0; k < words.length; k++) {
                if (words[i].equals(words[k])) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(words[i]);
            }
        }
//    Complete a void method printUniqueWords() that will print only unique words from an array of strings.
//    Every single unique word should be printed from the new line.
//
//Example:
//input:[java, code, python, code, rust, code, rust]
//output:
//java
//python
    }
}