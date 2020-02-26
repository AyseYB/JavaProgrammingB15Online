package day30;

import java.util.Arrays;

public class SplitAndDefineSize {
    public static void main(String[] args) {
// SPLIT SAYS BASICLY HOW MANY PIECES YOU NEED
        String senterce= "I love Java Java Java";
        String[] wordArray = senterce.split(" ");
        System.out.println("wordArray = " + Arrays.toString(wordArray));

        String[] wordArray1 = senterce.split(" " , 2);
        String[] wordArray2 = senterce.split(" " , 3);
        String[] wordArray3 = senterce.split(" " , 4);
        String[] wordArray4 = senterce.split(" " , 5);
        String[] wordArray5 = senterce.split(" " , 6);
        System.out.println("wordArray1 = " + Arrays.toString(wordArray1));
        System.out.println("wordArray2 = " + Arrays.toString(wordArray2));
        System.out.println("wordArray3 = " + Arrays.toString(wordArray3));
        System.out.println("wordArray4 = " + Arrays.toString(wordArray4));
        System.out.println("wordArray5 = " + Arrays.toString(wordArray5));

       // System.out.println("wordArray size = " + wordArray1.length);







    }
}
