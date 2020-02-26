package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false ));

        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, false ));




    }
//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//For example :
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

    /**
     *
     * A method that return Yes only if both monkeys are smiling or not smiling
     * @param aSmile
     * @param bSmile
     * @return  yes only if both monkeys are smiling or not smiling , no if not
     */
    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
//
//        if ((aSmile && bSmile)  || ( !aSmile && !bSmile)){
//            return true;
//        }else {
//            return false;
//        }

        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

       // A method that return Yes only if both monkeys are smiling or not smiling
        public static String monkeyTrouble2(boolean asmile, boolean bsmile) {

           if((asmile && bsmile) || (!asmile &&!bsmile)) {
                return "yes";
            } else {
                return "No";
            }
        }


}
