package day13;

public class StringMethods {
    public static void main(String[] args) {

        //String actions that we already know so far
        //equals
        String s1 ="Hello";
        System.out.println(s1.equals("abc"));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method od String is used to make String all character uppercase
        System.out.println(   s1.toUpperCase()     );
        //to lowerCase method of String is used to make String all character lowercase
        System.out.println(s1.toLowerCase());

        //store your name into a variable
        //print your name in all uppercase
        //you may optionally concatenate "MY NAME IS :YOUR NAME
// YOU may optionally concatenate " my name is : yourname"
        String myName ="Ayse";
        System.out.println("MY NAME IS :" +myName.toUpperCase());
        System.out.println("mY name is :" +myName.toLowerCase());

        //in order to get how many character we have inside String
        // we can use length method of String
        System.out.println(  s1.length() );

        int lengthOfString =s1.length();
        if( lengthOfString>4){
            System.out.println(" more than four character");
        }else{
            System.out.println(" not more than 4");

        }
    }
}
