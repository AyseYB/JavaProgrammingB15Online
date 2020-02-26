package day20;

public class ReversingAString$$$$$$ {

    public static void main(String[] args) {


        // given a String variable name with value
        // reverse this name and store reversed value into
        // another String variable reversedName
        //             01234567
        String name = "Emin Alp";
        String reverseName = "" ;


//        int lastCharIndex =name.length()-1;
//        for (int x = lastCharIndex; x >= 0; x--) {
//            System.out.print("index = " + x);
//
//            System.out.println(" " +  name.charAt(x));
//            reverseName = reverseName+ name.charAt(x);
//        }
//        System.out.print(" reversed name = " + reverseName);
//


        int lastCharIndex =name.length()-1;

        for (int x = lastCharIndex; x >= 0 ; x--) {

            System.out.print("x = " + x);
            System.out.println(" " + name.charAt(x));
            reverseName = reverseName + name.charAt(x);

        }
        System.out.println(" reverse name :" + reverseName);





















        // System.out.print(  name.charAt(7)  );
//        System.out.print(  name.charAt(6)  );
//        System.out.print(  name.charAt(5)  );
//        System.out.print(  name.charAt(4)  );
//        System.out.print(  name.charAt(3)  );
//        System.out.print(  name.charAt(2)  );
//        System.out.print(  name.charAt(1)  );
//        System.out.print(  name.charAt(0)  );


    }
}
