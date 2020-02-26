package office_hour;

import java.util.Arrays;

public class Repl_129_ArrayCopyCertainValues {
    public static void main(String[] args) {
//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//
//        Create another array fewValues and copy words that have letter "e" in them

//        You need to know how many element contain "e" and create array accordingly
//
//        Values in fewValues array need to be["zero", "one","three"]
//
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

      int count=0;
      for( String eachWord: arr){
          if(eachWord.contains("e")){
              count++;
          }
      }
      String[] fewValues=new String[count];
      int index = 0;
      for(String eachWord : arr){
          if (eachWord.contains("e"))
          {
              fewValues[index] = eachWord;
              index++;
          }
      }
        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
