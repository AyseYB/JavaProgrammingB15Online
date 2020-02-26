package day17;

public class ReversePrintString {

    public static void main(String[] args) {

        //get your name printed in reversed order
        //assuming we dont know the length
        //pick your last character of your name according to the location
        // then keep shifting the location to pick until first character

        String name = "Mustafa";
       // int lastCharacterIndex = name.length()-1;
        int x = name.length() - 1 ;
        while (x >= 0){
            System.out.println("Index " + x  + " : " + name.charAt(x));
            --x;
        }






    }
}
