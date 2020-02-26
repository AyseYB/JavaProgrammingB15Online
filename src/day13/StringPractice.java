package day13;

public class StringPractice {

    public static void main(String[] args) {

        String s1= "Hello";
        System.out.println(s1.equalsIgnoreCase("hello"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.startsWith("H"));
        System.out.println("merhaba is Turkish version of "+ s1.toLowerCase());
        System.out.println(s1.length());

        int lengthOfString = s1.length();
        if ( lengthOfString> 4&& lengthOfString<6){
            System.out.println(" 5 character");
        }else {
            System.out.println("not more than 4");
        }









    }
}
