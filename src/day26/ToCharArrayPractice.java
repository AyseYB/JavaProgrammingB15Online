package day26;

import java.util.Arrays;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 month Survey";
        //Bu stringi char arraya donustuurken!!!!!!!!!!
        char[] surveyChars= survey.toCharArray();

        for( char each: surveyChars) {
            //System.out.println("each char is with for each loop: " + each);
        }
        //just for fun!!
        int x = 0;
        while ( x < surveyChars.length){
        //    System.out.println( "each char is with while loop : " + surveyChars[x]);
            x++;
        }

        for( int i = 0 ; i < surveyChars.length ; i++){
       //     System.out.println("each char is with for loop : " + surveyChars[i]);
        }
        System.out.println();
        int y = 0;
        do {
            System.out.println(" each char with do while loop : " +  surveyChars[y]);
            y++;
        }while (y < surveyChars.length);










    }
}
