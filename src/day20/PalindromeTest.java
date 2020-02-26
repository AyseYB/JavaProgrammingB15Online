package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // if you reverse a String if it does not change
        // it means the string is Palindrome
        // level , kayak , elle , madam , aziza

        String name ="kayak";
        System.out.println("name = " + name);
        String reversedName = "";

        for (int x = name.length()-1 ; x >= 0; --x){
            reversedName = reversedName+ name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);

        if( name.equalsIgnoreCase(reversedName)){
            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println(" PALINDROME TEST HAS FAILED");
        }







    }
}
