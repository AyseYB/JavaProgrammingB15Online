package office_hour;

import java.util.Scanner;

public class repl_120 {

    public static void main(String[] args) {

//        Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
//
//        Example:
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//        prints jaaaaavvaaaaaaaaaa

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }

        int maxLength = 0;
        String maxString = "";
        for( int i = 0 ; i < words.length ; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxString = words[i];
            }
        }
        System.out.println( maxString);

    }


}

