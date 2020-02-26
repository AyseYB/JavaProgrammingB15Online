package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        // Character class has lots of static methods
        // to perform actions on char values
        // isDigit , isLetter , isLetterOrDigit , isUpperCase  , isLowerCase
        // toUpperCase , toLowerCase
        System.out.println("IS DIGIT METHOD PRACTICE ");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the numbers out of this String
        // and store it into Integer variable num ;
        String numsInStr ="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                System.out.println("str.charAt (" +i + ") " + str.charAt(i));
                // appending number character to the result numsInStr
                numsInStr+=str.charAt(i);
            }

        }
        System.out.println("numsInStr = " + numsInStr);
        // The requirement says get the result as Integer object
        Integer num =Integer.parseInt(numsInStr);
        System.out.println("num = " + num);

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method



    }
}
