package day19;



public class Homework {
    public static void main(String[] args) {

        String word1= "Hello";
        String word2=" World";
        char wordF =word1.charAt(0);
        char wordS =word2.charAt(0);

        if(wordF >= wordS){
            for (char f =wordF ;f >=wordS ; f++){
                System.out.print(f + " ");
            }
            System.out.println();
        }else if(wordS >=wordF){
            for( char s = wordS ; s >=wordF; s++){
                System.out.print(s + " ");
            }
        }










    }
}