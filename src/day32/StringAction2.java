package day32;

public class StringAction2 {

    public static void main(String[] args) {

        printStringWithDashInBetween("AYSE");
        reversePrintMyOwnName();

    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar -->> A-k-b-a-r
    // logic : keep concatenating - after each character
    // when it comes to last character don't add it

    public static void printStringWithDashInBetween(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print(" - ");
            }

        }
        System.out.println();
    }
       /*
    * reversePrintMyOwnName
    * create a method that has no parameter
	    and print your name in reversed order
    * */

    public static void reversePrintMyOwnName() {
        String name = "AYSE";
        for (int i = name.length()-1 ; i >=0 ; i--) {
            System.out.print(name.charAt(i) + "  ");

        }
    }


}




