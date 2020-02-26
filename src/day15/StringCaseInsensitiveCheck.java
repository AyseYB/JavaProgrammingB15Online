package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println();
        // i want to check whether this name contains st no matter the case
        // so i want to store the upperCase verson of this name then check for ST
        String uppercasename = name.toUpperCase(); //ARYA STARK;
        System.out.println("uppercaseName contains ST or not?" + uppercasename.contains("ST"));


    }
}
