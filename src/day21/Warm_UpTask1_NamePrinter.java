package day21;

public class Warm_UpTask1_NamePrinter {

    public static void main(String[] args) {
            /*
    * iven your name stored in a variable myName as String
 for example :  String myName = "My name is Yourname here" :
     1, loop through each and every character print them out like this :
     *  M->y-> >n->a->m->e-> and so on
     put arrow in beterrn the character
     I challenge you to use substring for this task
    *
    * */

        //String myName ="Yusuf Bilgic";
//       int charCount=myName.length();
//       int lastCharIndex =charCount-1;
//
//        for (int x = 0; x <=lastCharIndex  ; x++) {
//            System.out.print(myName.charAt(x) + " -> ");
//        }
        //int charCount= myName.length();
//        int lastCharIndex=myName.length()-1;
//        System.out.println("lastCharIndex = " + lastCharIndex);
//        for (int x = 0; x <= lastCharIndex ; x++) {

          //  System.out.print(myName.charAt(x)+ " -> ");
        //    System.out.print(myName.substring(x,x+1) + " ->");
//
//        String greet ="Hello World";
//        int charCount = greet.length();
//        for (int x = 0 ; x <= charCount-1 ; x++){
//            System.out.print(greet.substring(x,x+1) +" -> ");
//        }
//
//        for (int y = 0 ; y<charCount-1 ;y++){
//            System.out.println(greet.substring(y, y +2));
//        }

String name="step by step";
int counter =0 ;
int countOfChar = name.length();
int charOfIndex=countOfChar-1;
        for (int x = 0; x < countOfChar ; x++) {
            if(name.equalsIgnoreCase("e")){
                counter++;
            }
            System.out.println(name.substring(x,x+1) + " => ");

        }
        System.out.println("counter = " + counter);
















    }
}
