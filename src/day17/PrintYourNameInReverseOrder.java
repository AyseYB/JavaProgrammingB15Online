package day17;

public class PrintYourNameInReverseOrder {

    public static void main(String[] args) {
        // get your name printed in reversed order
        // assuming we dont know the length
        //find out the location of your last character of your name
        //pick you last character of your name according to the location
        //then keep shifting

        String name="Yusuf Ibrahim Bilgic";
        int x=name.length()-1;
//        while( x >=0){
//            System.out.print( name.charAt(x) );
//            --x;
//        }
        while( x >= 0){
            System.out.println("index" + x +  " : " + name.charAt(x));
            --x;
        }







    }
}
