package day16;

public class WakeUpTask1Reverse {

    public static void main(String[] args) {
        // given a word with 4 character. stored in a String variable word1,
        //create a String varible word2. store the reserved word1 into word2
        // and print it out
        // for example
        //word1 ==> Java ---> word2 ---> avaJ
        String word1 = "Java";
        String word2 = "";


        // in order to reverse a word , we need to take last character and put in first character
        // then put the second character at 1 location before first character

        // start getting character from last location till first location then save it
       word2 = " "+word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
//        word2  = word2 +  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
      //  word2 += word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);

        System.out.println(word1 +" = " + word2);

        // I want to add world at the end of it
        String msg = "Hello ";
        //msg = msg + "World!" ;
        msg += "World!";
        System.out.println("msg = " + msg);







    }
}
