package day25;

import java.util.Arrays;

public class StringToCharArray2 {

    public static void main(String[] args) {

        // pick up your own name and turn in into char array
        // and use for each loop to loop over them
        // optionally count how many a you have in your name
        
//        String name ="Anastasia";
      //  turn this into charArray using toCharArray() method of String
        // WHAT DOES IT DO ?
        // toCharArray() is a method of String that turn string into char array
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD ?
        // NO
        // WHAT DO I GET OUT OF IT ?
        // char array object that has all the characters of the String object
        
//        char[] allCharInName = name.toCharArray();
//        for (char eachChar :allCharInName){
//            System.out.println("eachChar = " + eachChar);
//        }
        String name ="Anastasia";

      char[] allCharInName =name.toCharArray();
        System.out.println("before sorting all char " +  Arrays.toString(allCharInName));
      for (char eachChar :allCharInName){
        //  System.out.println("eachChar = " + eachChar);
      }
//now how many " a " we have
        int count =0;
        for ( char eachChar: allCharInName){
            if(eachChar=='a'){
                ++count;
            }

        }
        System.out.println("count = " + count);


        Arrays.sort(allCharInName);
        System.out.println("After sorting all char = " +   Arrays.toString(allCharInName));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
