package day24;

import java.util.Arrays;

public class ArrayClassMethod {

    public static void main(String[] args) {

// Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString  --->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --->>   [item1 , item 2 , item 3 ...... lastItem]

        String [] superHeros ={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
       // System.out.println(superHeros);
        System.out.println(Arrays.toString(superHeros));

        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(superHerosAsString);

        System.out.println("============================");

        int[] numbers ={10, 44, 55, 3, 78};
        System.out.println("ARray to String(numbers) REsult");
        System.out.println(Arrays.toString(numbers));


        // create an double(data type) array of 3 items called prices  ; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String  in this format
        // for example : your first 2 line of output should look like this
        //  character at index 0 is :  yourCharacterHere
        //  character at index 1 is :  yourCharacterHere and so on all the way till last
        System.out.println("task ==========");
       // double[] prices = {3.14, 5.5, 9.0};
//        System.out.println(Arrays.toString(prices));
//
//        String pricesString =Arrays.toString(prices);
//        System.out.println("pricesString = " + pricesString);
//
//        for(int x =0 ; x < pricesString.length() ; x++);



        double[] prices=new double[]{3.14, 5.5, 9.0};
        System.out.println(Arrays.toString(prices));

        String priceString = Arrays.toString(prices);
        System.out.println(priceString);
        for(int i = 0; i<priceString.length() ; i++){
            System.out.println("character at index " + i + " is " + priceString.charAt(i));
        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE


        // we are looping over a String not an array so we keep looping until last character finishes
        // to make it obvious that [ ] and , are part of the String we got from the method



        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE


        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)













    }
}
