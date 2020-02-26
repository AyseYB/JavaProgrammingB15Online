package office_hour;

public class Repl_185 {

    public static void main(String[] args) {

        System.out.println(biggerS("Emin", "Zeynep"));

    }

    public static String biggerS(String a ,String b) {

        if( a.length() > b.length() ){
            return a;
        }
        return b;

    }
}
//the method gets two strings and return the longest one
//
//    biggerS("apple","orange") ==> "orange"