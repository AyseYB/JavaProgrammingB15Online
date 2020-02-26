package day32;

import javax.swing.*;

public class CharacterActions {
    public static void main(String[] args) {

        printAtoZ();
        printZToA();
        printAlphabetInRange('a', 'z');
        printAlphabetInRange('a', 'd');
        printAlphabetInRange('d', 'a');
        printAlphabetInRange('z','z');


    }

//    * create a method that has no parameter
//	and print Z-A in one line
    public static void printAtoZ(){
        for (char iChar = 'A'; iChar <='Z' ; iChar++) {
            System.out.print(iChar + " ");

        }
        System.out.println();
    }
    //print ZtoA
//       * create a method that has no parameter
	//and print Z-A in one line
    public static void printZToA(){
        for (char iChar = 'Z'; iChar >= 'A' ; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();
    }

//    printAlphabetInRange
//* create a method that have 2 char as parameters: beginning, ending
//if beginning character is before ending character
//	for example beginning A , ending D  -->> ABCD
//if beginning character is after ending character
//	for example beginning D , ending A  -->> DCBA
    public static void printAlphabetInRange(char beginning, char ending){
        if ( beginning < ending){
            System.out.println("We need to increment from " + beginning + " till " + ending);
            for ( char iChar = beginning; iChar <= ending; iChar++){
                System.out.print(iChar + " ");
            }
        }else if( beginning> ending){
            System.out.println("We need to decrement from " +beginning + " till " + ending );
            for( char iChar = beginning; iChar >= ending; iChar--){
                System.out.print(iChar + " ");
            }
        }else {
            System.out.print(" they are same character !!");
        }
    }

}

