package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String name ="susamsokagi" ;

//        char[] namesChar =new char[name.length() ];
//
//        for (int x = 0; x < namesChar.length ; x++){
//          namesChar[x]=name.charAt(x);
//        }
//        System.out.println("Names char = " + Arrays.toString(namesChar) );
//
//        char[] namesChar2 = name.toCharArray();
//        System.out.println("namesChar2 = " + Arrays.toString(namesChar2));

        // pick up your own name and turn in into char array
        // and use for each loop to loop over them
        // optionally count how many a you have in your name

        char[]allCharInName =new char[name.length()];
        for (char eachChar :allCharInName){
            System.out.println(Arrays.toString(allCharInName));
        }
        System.out.println(Arrays.toString(allCharInName));




//int countOfS =0;
//for (char eachChar:nameChar){
//    if (eachChar == 's'){
//        ++countOfS;
//
//    }
//}System.out.println(countOfS);





























    }
}
