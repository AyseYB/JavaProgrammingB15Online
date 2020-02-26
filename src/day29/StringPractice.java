package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1= "Superman-Clark Kent";

        //task ;
        //hero code is Superman and identity is Clark Kent
        //The initial of Hero is CK

        //LOGIC 1 : Split this String by dash
        String[] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));

        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];
// Here code is Superman and Identity is Clark kent
       // System.out.println("Here code is " + heroSplitted[0] + " and identity is " + heroSplitted[1]);
        System.out.println("Here code is " + heroCode + "and identity is " + fullName);

        //The initial of the hero is CK
        //i can just use fullName variable to finish this task.

        //LOGIC 1 : get the first letter of full name
        // then get the first letter after the space
        // concatenate them
        // downside is what if we have middle name
        // solution , instead of looking for the letter after space
        // look for last index of the space then get the next character

        //LOGIC 2 : we already have full name stored in fullName variable
        // split by space  --->> we will get the firstNme (middle name ) last name
        // get the fitst letter of full name
        // then get the last name using last item index
        // get the first character then concatenate
        // Clark Kent ---> [ Clark Kent , Kent }  Clark ---> C      Kent---->> K _CK

        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " + Arrays.toString(fullNameSplitted));

        String lastName = fullNameSplitted[ fullNameSplitted.length-1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is : " + fullName.charAt(0) + lastName.charAt(0) );





    }
}
