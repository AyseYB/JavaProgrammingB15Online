package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_138 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
      String[] splitSentence= sentence.split(" ");
      for(int i = splitSentence.length-1 ; i >=0 ; i--){
          if(i !=0 ){
              reversed +=splitSentence[i]+ " ";
          }else {
              reversed +=splitSentence[i];
          }
      }

//        String [] split=sentence.split(" ");
//
//        for (int i = split.length-1; i >=0 ; i--) {
//            if(i !=0){
//                reversed+=split[i]+ " ";
//            }
//            else {
//                reversed+=split[i];
//            }
//        }




        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
//Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
//
//Example:
//sentence -> "Java is fun"
//reversed -> "fun is Java"
}
