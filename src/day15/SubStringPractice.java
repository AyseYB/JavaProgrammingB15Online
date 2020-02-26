package day15;

public class SubStringPractice {

    public static void main(String[] args){       //getting the part of the String out of another String
        //             0123456789012345
        String movie ="Lord of the Ring ";
        // Substring will return part of another string
        //starting from beginning index until right before ending index

        String wordOf= movie.substring(5,7);
        System.out.println("word of =" + wordOf);
        // i want to get the String (of) from the movie

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe =" + wordThe);

        // get from the second word till last word!
        //
        // String movie ="Lord of the Ring ";
       // int startingPoint = movie.indexOf(" ")+ 1;
        //int endingPoint =movie.length();
        //assume we already know the location of starting point of second word
        //and the ending of the sentence
       // System.out.println(" second word till last "
        //+ movie.substring(startingPoint,endingPoint));


        String secondWordTillLast =movie.substring(5,16);
        System.out.println("secondWordTillLast =" + secondWordTillLast);
// if you want to start from somewhere and just get the rest of the string
        // above method will work, however there is even better method
        //if you just start from that location and get till the end
        String secondToLast = movie.substring(5);

        String wordLordOf =movie.substring(0,7);
        System.out.println("wordLordOf ="+ wordLordOf);




        //with this in mind : TASK
        //                       01234567890123451
        //        String movie ="Lord of the Ring ";
        //reverse Lord Of The Ring  ---> Ring Of The Lord
        String wordRing=movie.substring(12);
        String wordOfThe=movie.substring(4,12);
        String wordLord=movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + wordLord);

//TURN -->>Lord of the Ring ----> Ring of the Java Lord
        System.out.println(wordRing + wordOfThe + "Java " + wordLord);











    }
}
