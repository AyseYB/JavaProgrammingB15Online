package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_137 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

   String[] splitSentence = sentence.split(" ");
   for( int i = splitSentence.length -1 ; i >= 0 ; i--){
       System.out.println(splitSentence[i]);
   }

        }
    }
//    Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//Example:
//sentence -> "Java is fun"
//Print
//fun
//is
//Java

