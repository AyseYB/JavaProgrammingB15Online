package day36;

import java.util.BitSet;

public class MethodPractice {

    public static void main(String[] args) {

//        Boolean b = true;  // auto boxed it to Boolean Object
//
//        Boolean result1 = checkIfStringHasNumber("ayeddo123");
//
//        System.out.println(result1);

        System.out.println( checkIfStringHasNumber("ayedo23"));




    }

//     /**
//     * write a static method to accept a String and return Boolean(Yes Uppercase) .
//     * it should return true if the String contains at least one number.
//     *
//     * @param str
//     * @return true Boolean Object if the String contains at least one number.
//     */

    public static Boolean checkIfStringHasNumber (String str){

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                return true;
            }

        }


        return false;
    }
//    public static Boolean checkIfStringHasNumber(String str){
//
//        for (int i = 0; i <str.length() ; i++) {
//            char each =str.charAt(i);
//           if( Character.isDigit(each)){
//               return Boolean.valueOf(true);
//
//           }
//        }
//
//
//        return Boolean.valueOf(false);
//    }
}
