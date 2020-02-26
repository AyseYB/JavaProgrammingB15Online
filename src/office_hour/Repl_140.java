package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

//        String[] results = new String[words.length];
//
//        for(int i = 0 ; i < words.length ; i++){
//            results[i] = words[i].charAt(0) +""+ words[i].charAt(words[i].length()-1);
//        }
//
//        System.out.println(Arrays.toString(results));
        String[] result= new String[words.length];
        for(int i = 0 ; i < words.length; i++){
            result[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(result));



    }
}
//Given a String array words, iterate through each word and print first and
// last letter of each element in the format below.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//print → [ho, wy, by, ae, ne]