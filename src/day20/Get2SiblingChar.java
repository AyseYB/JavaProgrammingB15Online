package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with value
        // print 2 characters in one line as below example
        //
        // for example  :  Ayra
        /*
         */

        String name = "Ayra";
        int countOfChar= name.length();
        int lastCharIndex = name.length()-1;
         for(int x = 0 ; x<= lastCharIndex -1 ; x++)
             System.out.println(name.substring(x, x+2));


        //0123
        // for example  :  Ayra
        /*
            Ayr 012  -->> 03
            yra 123  -->> 14
//        System.out.println(  name.substring(0,3) );
//        System.out.println(  name.substring(1,4) );
        */

        System.out.println("GETTING 3 CHARACTER");
        for(int x =0 ; x <= lastCharIndex-2 ; x++){
            System.out.println(name.substring(x, x+3));
        }












    }
}
