package day32;

import javax.crypto.spec.PSource;

public class CharacterAction2 {

    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        printAlphabetInRange('a', 'd');
        printAlphabetInRange('d','a');

    }
      /*
    * printAtoZ
    * create a method that has no parameter
	    and print A-Z in one line
    *
    * */
      public static void printAtoZ(){
          for (char iChar = 'A'; iChar <= 'Z' ; iChar++) {
              System.out.print(iChar);

          }
          System.out.println();
      }

      public static void printZtoA(){
          for (char iChar = 'Z'; iChar >='A' ; iChar--) {
              System.out.print(iChar);

          }
          System.out.println();
      }

    /**
     * if beginning character is before ending character
     * for example beginning A , ending D  -->> ABCD
     * we did similar action with printing A-Z
     * <p>
     * if beginning character is after ending character
     * for example beginning D , ending A  -->> DCBA
     * we did similar action with printing Z-A
     */

    public static void printAlphabetInRange (char beginning, char ending){

        if( beginning < ending) {

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar);

            }
            System.out.println();
        }else if(beginning > ending){
            for (char iChar = beginning; iChar >= ending ; iChar--){
                System.out.print(iChar);
            }
            System.out.println();
        }else {
            System.out.println("they are the same character");
        }

    }



}
