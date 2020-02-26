package office_hour;

import java.util.Scanner;

public class Repl_106 {

    public static void main(String[] args) {
//        Inputs:
//        String word;
//
//        Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
//        In: howdyho
//                oo
//
//        In: huehuehuehue
//                ueueueue
//
//        In: poopoo what idk what im doing
//        ooooaiaioi

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

//       for (int i = 0 ; i < word.length() ; i++){
//           if(word.charAt(i)== 'a' || word.charAt(i)== 'e' ||word.charAt(i) =='i' ||word.charAt(i) =='o'
//               || word.charAt(i) =='u'){
//               System.out.println(word.charAt(i));
//           }
//
//       }
        for(int i = 0 ; i < word.length(); i++){
            if(word.charAt(i)== 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
            word.charAt(i) =='o' || word.charAt(i) == 'u'){
                System.out.println(word.charAt(i));
            }
        }











    }
}
