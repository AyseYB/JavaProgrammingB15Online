package day32;

public class StringAction {

    public static void main(String[] args) {

       // reversePrintMyOwnName();
        printStringWithDashInBetween("Ayse");
        printStringWithDashInBetween("Mustafa");

        String name= "Ayse";
//        for (int i = 0; i <name.length() ; i++) {
//            System.out.print(name.charAt(i));
//            //if i am not in the last indez then i print
//            if(i != name.length()-1){
//                System.out.print("-");
//            }
//
//        }
    }
//    reversePrintMyOwnName
//* create a method that has no parameter
//    and print your name in reversed order

    public static void reversePrintMyOwnName() {
        String myOwnName = "Ayse";
        for (int i = myOwnName.length() - 1; i >= 0; i--) {
            System.out.print(myOwnName.charAt(i));
        }
        System.out.println();
    }

    public static void printStringWithDashInBetween(String name){
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            //if i am not in the last indez then i print
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
    }
}
